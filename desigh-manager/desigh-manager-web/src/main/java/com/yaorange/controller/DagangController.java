package com.yaorange.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Dagang;
import com.yaorange.service.DagangService;

@Controller
public class DagangController {
	@Autowired private DagangService dagangService;
	@RequestMapping("/dagang-list")
	public String getPage(String name,HttpServletRequest request) {
		request.setAttribute("name", name);
		return "dagang-list";
	}
	@RequestMapping("/getDagangList")
	@ResponseBody
	public DataResult getDagangList(String name,Integer pageIndex,Integer pageSize) {
		return dagangService.getDagangList(name,pageIndex, pageSize);
	}
	@RequestMapping("/saveDagang")
	@ResponseBody
	public EasyBuyResult saveDagang(Dagang dagang) {
		dagang.setCreatetime(new Date());;
		return dagangService.saveDagang(dagang);
	}
	@RequestMapping("/dagang-edit")
	public String editDagang(Integer id,Model model) {
		Dagang dagang  = dagangService.getDagangById(id);
		model.addAttribute("dagang", dagang);
		return "dagang-edit";
	}
	@RequestMapping("/updateDagang")
	@ResponseBody
	public EasyBuyResult updateDagang(Dagang dagang) {
		return dagangService.updateDagang(dagang);
	}
	
	@RequestMapping("/deleteDagang")
	@ResponseBody
	public EasyBuyResult deleteDagang(Integer id) {
		return dagangService.deleteDagang(id);
	}
	
	@RequestMapping("/deleteAllDagang")
	@ResponseBody
	public EasyBuyResult deleteAllDagang(String ids) {
		return dagangService.deleteAllDagang(ids);
	}
}