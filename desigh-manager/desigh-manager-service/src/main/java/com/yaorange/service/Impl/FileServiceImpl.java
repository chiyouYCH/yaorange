package com.yaorange.service.Impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yaorange.pojo.PicResult;
import com.yaorange.service.FileService;
import com.yaorange.utils.FastDFSClient;
@Service
public class FileServiceImpl implements FileService {
	@Value("${FILE_PREFIX_URL}")
	private String FILE_PREFIX_URL;
	@Value("${RECORD_FILE_PATH}")
	private String RECORD_FILE_PATH;
	@Value("${RECORD_FILE_VISIAL_PATH}")
	private String RECORD_FILE_VISIAL_PATH;
	@Override
	public PicResult upload(MultipartFile uploadFile) {
		PicResult result=new PicResult();
		String resultUrl=null;
		if(uploadFile!=null){
			try {
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:resource/client.conf");
			String fileName=uploadFile.getOriginalFilename();
			String extName = fileName.substring(fileName.lastIndexOf(".")+1);
			if (fileName != null && !"".equals(fileName) && extName != null & !"".equals(extName)) {
				String retVal = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
				resultUrl = FILE_PREFIX_URL + retVal;
			}
			result.setUrl(resultUrl);
			result.setError(0);
			result.setMessage("上传成功！");
			} catch (Exception e) {
				result.setMessage("上传失败！");
				result.setError(1);
				e.printStackTrace();
			}
		}
		return result;
	}

}
