package com.duanwl.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanwl.cms.dao.ArticleMapper;
import com.duanwl.cms.domain.Article;
import com.duanwl.cms.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: ArticleServiceImpl 
 * @Description: service实现类
 * @author: 段文龙
 * @date: 2020年4月27日 下午5:51:01
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Resource
	ArticleMapper articleMapper;
	/**
	 * 我的列表
	 */
	@Override
	public PageInfo<Article> selects(Article articles, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize); 
		List<Article> list = articleMapper.selects(articles);
		return new PageInfo<Article>(list);
	}
	/**
	 * 根据id查找文章
	 */
	@Override
	public Article select(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.select(id);
	}
	/**
	 * 添加文章
	 * 发布文章
	 */
	@Override
	public int insert(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.insert(article);
	}
	

}
