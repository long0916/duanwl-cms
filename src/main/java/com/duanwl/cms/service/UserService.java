package com.duanwl.cms.service;

import com.duanwl.cms.domain.User;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: UserService 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年5月8日 下午7:05:07
 */
public interface UserService {
	
	/**
	 * 
	 * @Title: selectByName 
	 * @Description: 根据用户名称查询用户
	 * @param username
	 * @return
	 * @return: User
	 */
	User selectByName(String username);
	/**
	 * 
	 * @Title: insert 
	 * @Description: 注册
	 * @param user
	 * @return
	 * @return: int
	 */
	int insert(User user);

	/**
	 * 
	 * @Title: selects 
	 * @Description: 用户列表
	 * @param user
	 * @return
	 * @return: List<User>
	 */
	PageInfo<User> selects(User user,Integer pageNum,Integer pageSize);
	
	/**
	 * 
	 * @Title: update 
	 * @Description: 修改用户
	 * @param user
	 * @return: void
	 */
	int update(User user);
	/**
	 * 
	 * @Title: login 
	 * @Description: TODO
	 * @param user
	 * @return
	 * @return: User
	 */
	User  login(User user);
}
