package com.yaorange.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.mapper.UserMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.InterviewRecords;
import com.yaorange.pojo.Student;
import com.yaorange.pojo.User;
import com.yaorange.pojo.UserExample;
import com.yaorange.pojo.UserExample.Criteria;
import com.yaorange.service.InterviewRecordService;


@Controller
public class InterviewRecordController {

	@Autowired
	private InterviewRecordService interviewRecordService;

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/interviewRecord-list")
	public String getPage(String name,HttpServletRequest request) {
		request.setAttribute("name", name);
		return "interviewRecord-list";
	}

	@RequestMapping("/getInterviewRecordList")
	@ResponseBody
	public DataResult getInterviewRecordList(String name,Integer pageIndex,Integer pageSize) {
		System.out.println("**************");
		return interviewRecordService.getInterviewRecordList(name,pageIndex, pageSize);
	}

	@RequestMapping("/deleteInterviewRecord")
	@ResponseBody
	public EasyBuyResult deleteInterviewRecord(Integer id) {
		return interviewRecordService.deleteInterviewRecord(id);
	}


	@RequestMapping("interviewRecord-edit")
	public String editClass(Integer id,Model model) {
		InterviewRecords ir = interviewRecordService.getInterviewRecordById(id);
		model.addAttribute("ir", ir);
		return "interviewRecord-edit";
	}




	@RequestMapping("/updateInterviewRecord")
	@ResponseBody
	public EasyBuyResult updateInterviewRecord(InterviewRecords interviewRecords,HttpServletRequest request) {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		UserExample userExample = new UserExample();
		Criteria cr = userExample.createCriteria();
		cr.andUsernameEqualTo(username);
		List<User> users = userMapper.selectByExample(userExample);
		Integer code = users.get(0).getCode();

		if(code!=1){//非学生修改
			return interviewRecordService.updateInterviewRecord(interviewRecords);
		}
		EasyBuyResult easyBuyResult = new EasyBuyResult();
		easyBuyResult.setMsg("抱歉，你没有权限修改！");
		easyBuyResult.setStatus(0);
		return easyBuyResult;
	}



	@RequestMapping(value="/saveInterviewRecord",method={RequestMethod.POST})
	@ResponseBody
	public EasyBuyResult saveInterviewRecord(InterviewRecords interviewRecords,String interviewtime2,HttpServletRequest request) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		UserExample userExample = new UserExample();
		Criteria cr = userExample.createCriteria();
		cr.andUsernameEqualTo(username);
		List<User> users = userMapper.selectByExample(userExample);
		Integer studentid = users.get(0).getId();
		interviewRecords.setStudentid(studentid);
		try {
			Date parse = simpleDateFormat.parse(interviewtime2);
			interviewRecords.setInterviewtime(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return interviewRecordService.saveInterviewRecord(interviewRecords);
	}



}
