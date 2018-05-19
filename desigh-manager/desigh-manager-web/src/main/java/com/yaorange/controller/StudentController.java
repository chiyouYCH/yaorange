package com.yaorange.controller;


import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.annotation.RequiredTypes;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.mapper.UserMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;
import com.yaorange.pojo.User;
import com.yaorange.pojo.UserExample;
import com.yaorange.pojo.UserExample.Criteria;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;
import com.yaorange.service.StudentService;

@Controller
public class StudentController {
	@Autowired
    StudentService studentService;

	@Autowired 
	private UserMapper userMapper;


	//模糊查询
	@RequestMapping("/student-list")
	public String getPage(String username,HttpServletRequest request) {
		request.setAttribute("username", username);
		return "student-list";
	}
	@RequestMapping("/getStudentList")
	@ResponseBody
	public DataResult getStudentList(String username,Integer pageIndex,Integer pageSize) {
		return studentService.getStudentList(username, pageIndex, pageSize);
	}
	
	
	//学生添加

	@RequestMapping(value="/saveStudent",method={RequestMethod.POST})
	@ResponseBody
	public EasyBuyResult saveStudent(Student student,String graduationtime_a) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date parse = simpleDateFormat.parse(graduationtime_a);
			student.setGraduationtime(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentService.saveStudent(student);
	}
	
	//学生删除
	@RequestMapping("/deleteStudent")
	@ResponseBody
	public EasyBuyResult deleteStudent(Integer id) {
		return studentService.deleteStudent(id);
	}
	//学生修改
	@RequestMapping("/updateStudent")
	@ResponseBody
	public EasyBuyResult updateStudent(Student student,HttpServletRequest request) {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		UserExample userExample = new UserExample();
		Criteria cr = userExample.createCriteria();
		cr.andUsernameEqualTo(username);
		List<User> users = userMapper.selectByExample(userExample);
		Integer code = users.get(0).getCode();
		
		if(code!=1){//非学生修改
			return studentService.updateStudent(student);
		}
		 EasyBuyResult easyBuyResult = new EasyBuyResult();
		 easyBuyResult.setMsg("抱歉，你没用权限修改！");
		 easyBuyResult.setStatus(0);
		 return easyBuyResult;
	}
	
		
	
	@RequestMapping("/student-edit")
	public String editClass(Integer id,Model model) {
		Student stu = studentService.getStudentById(id);
		model.addAttribute("stu", stu);
		return "student-edit";
	}
	//批量删除
	@RequestMapping("/deleteAllStudent")
	@ResponseBody
	public EasyBuyResult deleteAllStudent(String ids) {
		return studentService.deleteAllStudent(ids);
	}

}
