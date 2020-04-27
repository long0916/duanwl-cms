package com.duanwl.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanwl.cms.dao.ArticleMapper;
import com.duanwl.cms.domain.Article;
import com.duanwl.cms.service.ArticleService;
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
	@Override
	public List<Article> selects() {
		// TODO Auto-generated method stub
		return articleMapper.selects();
	}

}
