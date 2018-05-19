package com.yaorange.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.CourseMapper;
import com.yaorange.pojo.Course;
import com.yaorange.pojo.CourseExample;
import com.yaorange.pojo.CourseExample.Criteria;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    
	@Override
	public List<Course> getCourseList(){
		return courseMapper.selectByExample(null);
	}
	public EasyBuyResult savecourse(Course course) {
		try {
			courseMapper.insert(course);
			return EasyBuyResult.build(200,"添加成功");
		} catch (Exception e) {
			return EasyBuyResult.build(200,"添加失败");
		}
	}
	@Override
	public EasyBuyResult deleteCourse(Integer id) {
		int key = courseMapper.deleteByPrimaryKey(id);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}
	public List<Course> getcourseList() {
//		courseExample example = new courseExample();
//		List<course> list = courseMapper.selectByExample(example);
		return null;
	}
	@Override
	public EasyBuyResult updateCourse(Course course) {
//		course.setCreatetime(new Date());
		int key = courseMapper.updateByPrimaryKeySelective(course);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public Course getCourseById(Integer id) {
		return courseMapper.selectByPrimaryKey(id);
	}
	@Override
	public EasyBuyResult deleteAllCourse(String ids) {
		CourseExample example=new CourseExample();
		Criteria criteria=example.createCriteria();
		List<Integer> list=new ArrayList<>();
		String [] split=ids.split(",");
		for (String str : split){
			if(StringUtils.isNotEmpty(str)){
				Integer id = Integer.valueOf(str).intValue();
				list.add(id);
			}						
		}
//		criteria.andIdIn(list);
		int key = courseMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}
	@Override
	public EasyBuyResult saveCourse(Course course) {
		int key = courseMapper.insert(course);
		if (key > 0) {
			return EasyBuyResult.build(200, "添加成功");
		}
		return EasyBuyResult.build(200, "添加失败，请重试");
	}

}
