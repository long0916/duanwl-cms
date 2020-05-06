package com.duanwl.cms.service;
/**
 * 
 * @ClassName: UserService 
 * @Description: 用户service
 * @author: 段文龙
 * @date: 2020年5月6日 下午6:29:28
 */

import com.duanwl.cms.domain.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
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
}
