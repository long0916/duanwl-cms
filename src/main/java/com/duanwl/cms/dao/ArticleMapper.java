package com.duanwl.cms.dao;

import java.util.List;

import com.duanwl.cms.domain.Article;

/**
 * 
 * @ClassName: ArticleMapper 
 * @Description: 文章mapper
 * @author: 段文龙
 * @date: 2020年4月27日 下午5:47:41
 */
public interface ArticleMapper { 
	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章列表查询
	 * @param articles
	 * @return
	 * @return: List<Article>
	 */
	List<Article> selects(Article articles);
}
