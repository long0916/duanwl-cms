package com.duanwl.cms.service;

import java.util.List;

import com.duanwl.cms.domain.Article;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: ArticleService 
 * @Description: service接口
 * @author: 段文龙
 * @date: 2020年4月27日 下午5:50:12
 */
public interface ArticleService {
	/**
	 * 
	 * @Title: insert 
	 * @Description: 增加文章
	 * @param article
	 * @return
	 * @return: int
	 */
	int insert(Article article);
	
	/**
	 * 
	 * @Title: select 
	 * @Description: 文章详情
	 * @param id
	 * @return
	 * @return: Article
	 */
	Article select(Integer id);
	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章列表
	 * @param articles
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: PageInfo<Article>
	 */
	PageInfo<Article> selects(Article articles,Integer pageNum,Integer pageSize);


}
