package com.yaorange.service;

import java.util.List;

import com.yaorange.pojo.Course;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Course;

public interface CourseService {

	List<Course> getCourseList();

	EasyBuyResult saveCourse(Course Course);

	EasyBuyResult deleteCourse(Integer id);

	EasyBuyResult updateCourse(Course Course);

	Course getCourseById(Integer id);

	EasyBuyResult deleteAllCourse(String ids);

}
