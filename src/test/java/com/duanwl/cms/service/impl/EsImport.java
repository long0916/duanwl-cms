package com.duanwl.cms.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.duanwl.cms.dao.ArticleMapper;
import com.duanwl.cms.domain.Article;
import com.duanwl.cms.service.ArticleService;
import com.duanwl.cms.util.EsUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-beans.xml"})
public class EsImport {
	@Autowired
	private ArticleMapper articleMapper;
	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;
	
	
	@Test
	public void im_hot() {
		List<Article> articles = articleMapper.findAll();
		for(Article article:articles) {
			EsUtils.saveObject(elasticsearchTemplate, article.getId()+"", article);
		}
	}
}
