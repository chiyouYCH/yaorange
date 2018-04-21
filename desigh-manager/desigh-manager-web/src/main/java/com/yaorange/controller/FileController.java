package com.yaorange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yaorange.pojo.PicResult;
import com.yaorange.service.FileService;

@Controller
public class FileController {
	@Autowired
	private FileService fileService;
	@RequestMapping("/record/upload")
	@ResponseBody
	public PicResult uploadPic(MultipartFile uploadrecord){
		return fileService.upload(uploadrecord);
	}
	

}
