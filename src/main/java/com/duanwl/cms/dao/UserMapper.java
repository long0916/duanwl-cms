package com.duanwl.cms.dao;
/**
 * 
 * @ClassName: UserMapper 
 * @Description: 用户
 * @author: 段文龙
 * @date: 2020年5月6日 下午6:20:44
 */

import java.util.List;

import com.duanwl.cms.domain.User;

public interface UserMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 用户列表
	 * @param user
	 * @return
	 * @return: List<User>
	 */
	List<User> selects(User user);
	
	/**
	 * 
	 * @Title: update 
	 * @Description: 修改用户
	 * @param user
	 * @return: void
	 */
	int update(User user);
}
