package com.yaorange.service.Impl;

import java.util.ArrayList;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.StudentMapper;
import com.yaorange.mapper.UserMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;
import com.yaorange.pojo.StudentExample;
import com.yaorange.pojo.StudentExample.Criteria;
import com.yaorange.pojo.User;
import com.yaorange.pojo.UserExample;
import com.yaorange.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private UserMapper userMapper;
	@Override
	public DataResult getStudentList(String name, Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		StudentExample example=new StudentExample();
		List<Student> list=studentMapper.selectByExample(example);//默认查询所有学生信息
		/*Criteria criteria=example.createCriteria();*/
		/*if(StringUtils.isNotEmpty(name)){
			criteria.andStudentnameLike("%"+name+"%");
			criteria.andStudentnameEqualTo(name);
		}*/
		//example.setOrderByClause("id desc");
		UserExample userExample = new UserExample();
		com.yaorange.pojo.UserExample.Criteria createCriteria = userExample.createCriteria();
		createCriteria.andUsernameEqualTo(name);
		List<User> user = userMapper.selectByExample(userExample);
		if(user.get(0).getCode()==1){
			//登录用户为学生，则只查询出当前学生信息
			Criteria createCriteria2 = example.createCriteria();
			createCriteria2.andStudentnameEqualTo(name);
			list=studentMapper.selectByExample(example);
		}
		
		PageInfo<Student> pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		DataResult result=new DataResult();
		result.setCount(total);
		result.setList(list);
		result.setMsg("获取成功");
		result.setRel(true);
		return result;
	}
	public EasyBuyResult saveStudent(Student student) {
		try {
			studentMapper.insert(student);
			return EasyBuyResult.build(200,"添加成功");
		} catch (Exception e) {
			return EasyBuyResult.build(200,"添加失败");
		}
	}
	@Override
	public EasyBuyResult deleteStudent(Integer id) {
		int key = studentMapper.deleteByPrimaryKey(id);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}
	public List<Student> getStudentList() {
		StudentExample example = new StudentExample();
		List<Student> list = studentMapper.selectByExample(example);
		return list;
	}
	@Override
	public EasyBuyResult updateStudent(Student student) {
		int key = studentMapper.updateByPrimaryKeySelective(student);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public Student getStudentById(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}
	@Override
	public EasyBuyResult deleteAllStudent(String ids) {
		StudentExample example=new StudentExample();
		Criteria criteria=example.createCriteria();
		List<Integer> list=new ArrayList<>();
		String [] split=ids.split(",");
		for (String str : split){
			if(StringUtils.isNotEmpty(str)){
				Integer id = Integer.valueOf(str).intValue();
				list.add(id);
			}						
		}
		criteria.andIdIn(list);
		int key = studentMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}

}
