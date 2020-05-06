package com.duanwl.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanwl.cms.dao.UserMapper;
import com.duanwl.cms.domain.User;
import com.duanwl.cms.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: UserServiceImpl 
 * @Description: 用户实现类
 * @author: 段文龙
 * @date: 2020年5月6日 下午6:31:35
 */
@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	@Override
	public PageInfo<User> selects(User user, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = userMapper.selects(user);
		
		return new PageInfo<User>(list);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userMapper.update(user);
	}


}
