package com.yaorange.service;

import org.springframework.web.multipart.MultipartFile;

import com.yaorange.pojo.PicResult;

public interface FileService {

	PicResult upload(MultipartFile uploadrecord);

}
