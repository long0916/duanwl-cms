package com.duanwl.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanwl.cms.dao.ChannelMapper;
import com.duanwl.cms.domain.Category;
import com.duanwl.cms.domain.Channel;
import com.duanwl.cms.service.ChannelService;

/**
 * 
 * @ClassName: ChannelServiceImpl 
 * @Description: 栏目service实现类
 * @author: 段文龙
 * @date: 2020年4月29日 下午6:02:33
 */
@Service
public class ChannelServiceImpl implements ChannelService{
	@Resource
	private ChannelMapper channelMapper;
	/**
	 * 查询所有栏目
	 */
	@Override
	public List<Channel> selects() {
		// TODO Auto-generated method stub
		return channelMapper.selects();
	}
	/**
	 * 根据栏目查类型
	 */
	@Override
	public List<Category> selectCategorysByChannelId(Integer channelId) {
		// TODO Auto-generated method stub
		return channelMapper.selectCategorysByChannelId(channelId);
	}
}
