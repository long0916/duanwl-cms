package com.duanwl.cms.service;

import java.util.List;

import com.duanwl.cms.domain.Slide;

/**
 * 
 * @ClassName: SlideService 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年5月7日 下午4:18:19
 */
public interface SlideService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询所有
	 * @return
	 * @return: List<Slide>
	 */
	List<Slide> selects();
}
