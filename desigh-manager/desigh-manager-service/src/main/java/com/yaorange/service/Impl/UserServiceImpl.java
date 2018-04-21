package com.yaorange.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.StudentMapper;
import com.yaorange.mapper.UserMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;
import com.yaorange.pojo.User;
import com.yaorange.pojo.UserExample;
import com.yaorange.pojo.UserExample.Criteria;
import com.yaorange.service.UserService;
@Service
public class UserServiceImpl  implements UserService{
    @Autowired 
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;
	@Override
	public DataResult getUserList(String name, Integer pageIndex, Integer pageSize) {
		// 设置分页
		PageHelper.startPage(pageIndex, pageSize);
		UserExample example=new UserExample();
		//设置模糊查询
		Criteria criteria=example.createCriteria();
		if(StringUtils.isNotEmpty(name)){
			criteria.andUsernameLike("%" + name + "%");
		}
		// 获取所有用户信息
		List<User> list = userMapper.selectByExample(example);
		// 获取总条数
	    PageInfo<User> pageInfo = new PageInfo<>(list);
	    long total= pageInfo.getTotal();
	    DataResult result=new DataResult();
	    result.setList(list);
	    result.setCount(total);
	    result.setRel(true);
	    result.setMsg("获取成功");
		return result;
	}

	@Override
	public int login(User user) {
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		List<User> key = userMapper.selectByExample(example);
		return key.size();
	}

	@Override
	public EasyBuyResult deleteUser(Integer id) {
		int key=userMapper.deleteByPrimaryKey(id);
		if(key==1){
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败");
	}

	@Override
	public EasyBuyResult deleteAllUser(String ids) {
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		List<Integer> list=new ArrayList<>();
		String[] split=ids.split(",");
		for (String str : split) {
			if(StringUtils.isNotEmpty(str)){
				Integer id = Integer.valueOf(str).intValue();
				list.add(id);
			}
		}
		criteria.andIdIn(list);
		int key = userMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}

	@Override
	public EasyBuyResult register(User user,Student student) {
		user.setCreatetime(new Date());
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		List<User> list=userMapper.selectByExample(example);
		if(list.size()>0){
			return EasyBuyResult.build(500,"该用户名已存在");
		}
		if(user.getCode()==2){
			student.setCreatetime(new Date());
			studentMapper.insert(student);
		}
		userMapper.insert(user);
		return EasyBuyResult.build(200,"注册成功");
	}


}
