package com.duanwl.cms.service.impl;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanwl.cms.dao.SlideMapper;
import com.duanwl.cms.domain.Slide;
import com.duanwl.cms.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService {

	@Resource
	private SlideMapper slideMapper;
	@Override
	public List<Slide> selects() {
		return slideMapper.selects();
	}

}
