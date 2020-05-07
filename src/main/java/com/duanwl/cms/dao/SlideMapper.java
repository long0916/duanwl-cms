package com.duanwl.cms.dao;


import java.util.List;

import com.duanwl.cms.domain.Slide;
/**
 * 
 * @ClassName: slideMapper 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年5月7日 下午4:14:53
 */
public interface SlideMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询所有
	 * @return
	 * @return: List<Slide>
	 */
	List<Slide> selects();
}
