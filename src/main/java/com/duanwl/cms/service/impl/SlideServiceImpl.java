package com.duanwl.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanwl.cms.dao.SlideMapper;
import com.duanwl.cms.domain.Slide;
import com.duanwl.cms.service.SlideService;

/**
 * 
 * @ClassName: SlideServiceImpl 
 * @Description: 实现类
 * @author: 段文龙
 * @date: 2020年5月7日 下午4:18:53
 */
@Service
public class SlideServiceImpl implements SlideService{

	@Resource
	private SlideMapper slideMapper;
	@Override
	public List<Slide> selects() {
		// TODO Auto-generated method stub
		return slideMapper.selects();
	}

}
