package com.yaorange.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;
import com.yaorange.service.StudentService;

@Controller
public class StudentController {
	@Autowired
    StudentService studentService;
	//模糊查询
	@RequestMapping("/student-list")
	public String getPage(String username,HttpServletRequest request) {
		request.setAttribute("username", username);
		return "student-list";
	}
	@RequestMapping("/getStudentList")
	@ResponseBody
	public DataResult getStudentList(String username,Integer pageIndex,Integer pageSize) {
		return studentService.getStudentList(username,pageIndex, pageSize);
	}
	
	//学生添加
	@RequestMapping("/saveStudent")
	@ResponseBody
	public EasyBuyResult saveStudent(Student student) {
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
	public EasyBuyResult updateStudent(Student student) {
		return studentService.updateStudent(student);
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
