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
import com.yaorange.pojo.Kejian;
import com.yaorange.service.KejianService;

@Controller
public class KejianController {
	@Autowired private KejianService kejianService;
	@RequestMapping("/kejian-list")
	public String getPage(String name,HttpServletRequest request) {
		request.setAttribute("name", name);
		return "kejian-list";
	}
	@RequestMapping("/getKejianList")
	@ResponseBody
	public DataResult getKejianList(String name,Integer pageIndex,Integer pageSize) {
		return kejianService.getKejianList(name,pageIndex, pageSize);
	}
	@RequestMapping("/saveKejian")
	@ResponseBody
	public EasyBuyResult saveKejian(Kejian kejian) {
		kejian.setCreatetime(new Date());;
		return kejianService.saveKejian(kejian);
	}
	@RequestMapping("/kejian-edit")
	public String editKejian(Integer id,Model model) {
		Kejian kejian  = kejianService.getKejianById(id);
		model.addAttribute("kejian", kejian);
		return "kejian-edit";
	}
	@RequestMapping("/updateKejian")
	@ResponseBody
	public EasyBuyResult updateKejian(Kejian kejian) {
		return kejianService.updateKejian(kejian);
	}
	
	@RequestMapping("/deleteKejian")
	@ResponseBody
	public EasyBuyResult deleteKejian(Integer id) {
		return kejianService.deleteKejian(id);
	}
	
	@RequestMapping("/deleteAllKejian")
	@ResponseBody
	public EasyBuyResult deleteAllKejian(String ids) {
		return kejianService.deleteAllKejian(ids);
	}
}
