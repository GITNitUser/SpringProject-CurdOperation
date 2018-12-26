package com.optum.dao;

import java.util.List;

import com.optum.bo.StudentBO;

public interface StudentDAO {
   public int saveRecord(StudentBO stdBO);
   public List<StudentBO> getAllUser();
   public StudentBO getStudent(int stdNo);
   public int updateRecord(StudentBO stdBO);
   public int deleteRecord(int stdNo);
}
