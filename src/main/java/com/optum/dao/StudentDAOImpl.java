package com.optum.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.optum.bo.StudentBO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	private static final String SAVE_RECORD_QUERY = "INSERT INTO STUDENT(STUDENTID,STUDENTNAME,STUDENTAGE,STUDENTAADHAR)VALUES(?,?,?,?)";
	private static final String GET_ALL_STUDENT_QUERY = "SELECT STUDENTID,STUDENTNAME,STUDENTAGE,STUDENTAADHAR FROM STUDENT";
	private static final String GET_STUDENT_QUERY = "SELECT STUDENTID,STUDENTNAME,STUDENTAGE,STUDENTAADHAR FROM STUDENT WHERE STUDENTID=?";
	private static final String UPDATE_STUDENT_DETAIL = "UPDATE STUDENT SET STUDENTNAME=?,STUDENTAGE=?,STUDENTAADHAR=?  WHERE STUDENTID=?";
	private static final String DELETE_STUDENT_DETAIL_BY_SNO = "DELETE FROM STUDENT WHERE STUDENTID=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int saveRecord(StudentBO stdBO) {
		int result = 0;

		result = jt.update(SAVE_RECORD_QUERY, stdBO.getStdNo(), stdBO.getStdName(), stdBO.getStdAge(),
				stdBO.getStdAadharNo());

		return result;
	}

	@Override
	public List<StudentBO> getAllUser() {
		List<StudentBO> listBO = null;

		listBO = jt.query(GET_ALL_STUDENT_QUERY, rs -> {
			List<StudentBO> list = new ArrayList<StudentBO>();

			while (rs.next()) {
				StudentBO bo = new StudentBO();

				bo.setStdNo(rs.getInt(1));
				bo.setStdName(rs.getString(2));
				bo.setStdAge(rs.getInt(3));
				bo.setStdAadharNo(rs.getLong(4));

				list.add(bo);
			} // end of while

			return list;
		});
		return listBO;
	}

	@Override
	public StudentBO getStudent(int stdNo) {
		StudentBO bo = null;

		bo = jt.queryForObject(GET_STUDENT_QUERY, (rs, index) -> {
			StudentBO stBO = new StudentBO();

			stBO.setStdNo(rs.getInt(1));
			stBO.setStdName(rs.getString(2));
			stBO.setStdAge(rs.getInt(3));
			stBO.setStdAadharNo(rs.getLong(4));

			return stBO;
		}, stdNo);

		return bo;
	}

	@Override
	public int updateRecord(StudentBO stdBO) {
		int result = 0;

		result = jt.update(UPDATE_STUDENT_DETAIL, stdBO.getStdName(), stdBO.getStdAge(), stdBO.getStdAadharNo(),
				stdBO.getStdNo());

		return result;
	}

	@Override
	public int deleteRecord(int stdNo) {
		int result = 0;

		result = jt.update(DELETE_STUDENT_DETAIL_BY_SNO, stdNo);

		return result;
	}

}
