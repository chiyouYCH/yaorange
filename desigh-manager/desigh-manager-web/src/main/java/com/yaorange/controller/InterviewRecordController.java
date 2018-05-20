package com.yaorange.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.pojo.DataResult;
import com.yaorange.service.InterviewRecordService;


@Controller
public class InterviewRecordController {

	@Autowired
	private InterviewRecordService interviewRecordService;
	
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
	
	
	
	
	
	
	
	
	
	/*
	@RequestMapping("/user-list")
	public String getPage(String name,HttpServletRequest request) {
		request.setAttribute("name", name);
		return "user-list";
	}
	@RequestMapping("/getUserList")
	@ResponseBody
	public DataResult getUserList(String username,Integer pageIndex,Integer pageSize) {
		return userService.getUserList(username,pageIndex, pageSize);
	}
	@RequestMapping("/deleteUser")
	@ResponseBody
	public EasyBuyResult deleteUser(Integer id) {
		return userService.deleteUser(id);
	}
	
	@RequestMapping("/deleteAllUser")
	@ResponseBody
	public EasyBuyResult deleteAllUser(String ids) {
		return userService.deleteAllUser(ids);
	}
	@RequestMapping("/userRegister")
	@ResponseBody
	public EasyBuyResult register(User user,Student student){
		return userService.register(user,student);
	}
	@RequestMapping("/userLogin")
	@ResponseBody
	public EasyBuyResult userLogin(User user,boolean rememberMe,HttpServletRequest request,HttpServletResponse response,HttpSession session){
		int i=userService.login(user);
		if(i==0){
			return EasyBuyResult.build(500, "登录信息有误，请重试");
		}
		if(rememberMe){
			Cookie cookUsername=new Cookie("username",user.getUsername());
			// 设置存活时间
			cookUsername.setMaxAge(7*24*60*60);
			Cookie cookPwd=new Cookie("password",user.getPassword());
			cookPwd.setMaxAge(7*24*60*60);
			response.addCookie(cookUsername);
			response.addCookie(cookPwd);
		}else{
			Cookie [] cookies=request.getCookies();
			for (Cookie cookie : cookies) {
				if("username".equals(cookie.getName())||"password".equals(cookie.getName())){
					cookie.setValue(null);
					response.addCookie(cookie);
				}
			}
		}
		session.setAttribute("username",user.getUsername());
		session.setMaxInactiveInterval(900);
		return EasyBuyResult.ok();
		
	}
	@RequestMapping("/loginout")
	public String loginout(HttpSession session) {
		// 清除session
		session.removeAttribute("userName");
		return "login";
	}
	*/

}
