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
import com.yaorange.pojo.Topic;
import com.yaorange.service.TopicService;

@Controller
public class TopicController {

	@Autowired
	private TopicService topicService;



	// 模糊查询
	@RequestMapping("/topic-list")
	public String getPage(String stemName,String knowpointName, String courseName, HttpServletRequest request) {
		request.setAttribute("stemName", stemName);
		request.setAttribute("knowpointName", knowpointName);
		request.setAttribute("courseName", courseName);
		return "topic-list";
	}

	@RequestMapping("/getTopicList")
	@ResponseBody
	public DataResult getknowPointList(String stemName,String knowpointName, String courseName, Integer pageIndex, Integer pageSize) {
		return topicService.getTopicList(stemName, knowpointName, courseName, pageIndex, pageSize);
	}
	
	// 学生添加
	@RequestMapping("/saveTopicList")
	@ResponseBody
	public EasyBuyResult savePointList(Topic topic) {
		return topicService.saveTopic(topic);
	}

	// 学生删除
	@RequestMapping("/deleteTopic")
	@ResponseBody
	public EasyBuyResult deletePointList(Integer id) {
		return topicService.deleteTopic(id);
	}
	
	@RequestMapping("/Topic-edit")
	public String editClass(Integer id,Model model) {
		Topic topic = topicService.getTopicById(id);
		model.addAttribute("topic", topic);
		return "topic-edit";
	}
	
	// 学生修改
	@RequestMapping("/updateTopic")
	@ResponseBody
	public EasyBuyResult updateTopic(Topic topic) {
		return topicService.updateTopic(topic);
	}
	
}
