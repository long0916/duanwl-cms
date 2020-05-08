package com.duanwl.cms.service;

import java.util.List;


import com.duanwl.cms.domain.Category;
import com.duanwl.cms.domain.Channel;
/**
 * 
 * @ClassName: ChannelService 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年5月8日 下午7:04:57
 */
public interface ChannelService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询所有栏目
	 * @return
	 * @return: List<Channel>
	 */
	List<Channel> selects();
	/**
	 * 
	 * @Title: selectCategorysByChannelId 
	 * @Description: 根据栏目查询分类
	 * @param channelId
	 * @return
	 * @return: List<Category>
	 */
	List<Category> selectCategorysByChannelId(Integer channelId);

}
