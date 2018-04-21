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
import com.yaorange.pojo.Shiping;
import com.yaorange.service.ShipingService;

@Controller
public class ShipingController {
	@Autowired private ShipingService shipingService;
	@RequestMapping("/shiping-list")
	public String getPage(String name,HttpServletRequest request) {
		request.setAttribute("name", name);
		return "shiping-list";
	}
	@RequestMapping("/getShipingList")
	@ResponseBody
	public DataResult getShipingList(String name,Integer pageIndex,Integer pageSize) {
		return shipingService.getShipingList(name,pageIndex, pageSize);
	}
	@RequestMapping("/saveShiping")
	@ResponseBody
	public EasyBuyResult saveShiping(Shiping shiping) {
		shiping.setCreatetime(new Date());;
		return shipingService.saveShiping(shiping);
	}
	@RequestMapping("/shiping-edit")
	public String editShiping(Integer id,Model model) {
		Shiping shiping  = shipingService.getShipingById(id);
		model.addAttribute("shiping", shiping);
		return "shiping-edit";
	}
	@RequestMapping("/updateShiping")
	@ResponseBody
	public EasyBuyResult updateShiping(Shiping shiping) {
		return shipingService.updateShiping(shiping);
	}
	
	@RequestMapping("/deleteShiping")
	@ResponseBody
	public EasyBuyResult deleteShiping(Integer id) {
		return shipingService.deleteShiping(id);
	}
	
	@RequestMapping("/deleteAllShiping")
	@ResponseBody
	public EasyBuyResult deleteAllShiping(String ids) {
		return shipingService.deleteAllShiping(ids);
	}
}
