package com.yaorange.service;

import org.springframework.web.multipart.MultipartFile;

import com.yaorange.pojo.EasyBuyResult;


/**
 * Created by admin on 2018/2/2 0002.
 */
public interface RedioService {
	EasyBuyResult fileUpload(MultipartFile uploadFile);
}
