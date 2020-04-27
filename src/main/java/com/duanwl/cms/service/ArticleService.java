package com.duanwl.cms.service;

import java.util.List;

import com.duanwl.cms.domain.Article;

/**
 * 
 * @ClassName: ArticleService 
 * @Description: service接口
 * @author: 段文龙
 * @date: 2020年4月27日 下午5:50:12
 */
public interface ArticleService {
	List<Article> selects();
}
