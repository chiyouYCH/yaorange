package com.yaorange.service;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;

public interface StudentService {

	DataResult getStudentList(String name, Integer pageIndex, Integer pageSize);

	EasyBuyResult saveStudent(Student student);

	EasyBuyResult deleteStudent(Integer id);

	EasyBuyResult updateStudent(Student student);

	Student getStudentById(Integer id);


	EasyBuyResult deleteAllStudent(String ids);

}
