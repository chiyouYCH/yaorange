package com.yaorange.service.Impl;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.service.RedioService;
import com.yaorange.utils.FastDFSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/2/2 0002.
 */
@Service
public class RedioServiceImpl implements RedioService {

    @Value("${FILE_PREFIX_URL}")
    private String FILE_PREFIX_URL;
    @Override
    public EasyBuyResult fileUpload(MultipartFile uploadFile) {
    	EasyBuyResult redioResult = new EasyBuyResult();
        if(uploadFile.isEmpty()){
        	return redioResult.build(200, "请重新上传");
           
        }
        try {
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:resource/client.conf");
            String fileName = uploadFile.getOriginalFilename();
            String extName = fileName.substring(fileName.indexOf(".")+1);
            String retVal = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
            redioResult.setMsg("上传成功");
            List<String> list = new ArrayList<>();
            list.add(FILE_PREFIX_URL+retVal);
            redioResult.setData(list);
            redioResult.setStatus(200);;

        } catch (Exception e) {
        	redioResult.build(200, "请重新上传");
            e.printStackTrace();
        }

        return redioResult;
    }
}
