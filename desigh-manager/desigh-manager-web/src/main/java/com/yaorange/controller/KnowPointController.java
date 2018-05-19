package com.yaorange.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.pojo.Course;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Knowpoint;
import com.yaorange.service.CourseService;
import com.yaorange.service.KnowPointService;

@Controller
public class KnowPointController {

	@Autowired
	private KnowPointService knowpointService;
	@Autowired
	private CourseService courseService;


	// 模糊查询
	@RequestMapping("/knowPoint-list")
	public String getPage(String knowpointName, HttpServletRequest request) {
		request.setAttribute("knowpointName", knowpointName);
		return "knowpoint-list";
	}

	@RequestMapping("/getknowPointList")
	@ResponseBody
	public DataResult getknowPointList(String knowpointName, Integer pageIndex, Integer pageSize) {
		/*byte[] bytes;
		String userName=null;
		try {
			bytes = knowpointName.getBytes("ISO-8859-1");
			userName = new String(bytes,"utf-8");
			userName = URLDecoder.decode(knowpointName, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		return knowpointService.getKnowPointList(knowpointName, pageIndex, pageSize);
	}
	
	@RequestMapping("/getknowlist")
	@ResponseBody
	public List<Knowpoint> getknowlist(String name){
		return knowpointService.getknowlist(name);
	}
	
	@RequestMapping("/getCourseList")
	@ResponseBody
	public List<Course> getCourseList() {
		return courseService.getCourseList();
	}

	// 学生添加
	@RequestMapping("/savePointList")
	@ResponseBody
	public EasyBuyResult savePointList(Integer courseId,String knowpointName) {
		return knowpointService.saveKnowPoint(courseId,knowpointName);
	}
	
	// 学生添加
	@RequestMapping("/saveCourse")
	@ResponseBody
	public EasyBuyResult saveCourse(Course course) {
		return courseService.saveCourse(course);
	}

	// 学生删除
	@RequestMapping("/deletePoint")
	@ResponseBody
	public EasyBuyResult deletePointList(Integer id) {
		return knowpointService.deleteKnowPoint(id);
	}
	
	
}
