package com.yaorange.service;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;
import com.yaorange.pojo.User;

public interface UserService {

	DataResult getUserList(String name, Integer pageIndex, Integer pageSize);

	int login(User user);

	EasyBuyResult deleteUser(Integer id);

	EasyBuyResult deleteAllUser(String ids);

	EasyBuyResult register(User user, Student student);

}
