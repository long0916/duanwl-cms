package com.duanwl.cms.dao;
/**
 * 
 * @ClassName: ChannelMapper 
 * @Description: 栏目
 * @author: 段文龙
 * @date: 2020年4月29日 下午5:52:43
 */

import java.util.List;

import com.duanwl.cms.domain.Category;
import com.duanwl.cms.domain.Channel;
/**
 * 
 * @ClassName: ChannelMapper 
 * @Description: 栏目
 * @author: 段文龙
 * @date: 2020年4月29日 下午5:58:13
 */
public interface ChannelMapper {
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
