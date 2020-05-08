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
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年5月8日 下午7:05:25
 */
@Service
public class SlideServiceImpl implements SlideService {

	@Resource
	private SlideMapper slideMapper;
	@Override
	public List<Slide> selects() {
		return slideMapper.selects();
	}

}
