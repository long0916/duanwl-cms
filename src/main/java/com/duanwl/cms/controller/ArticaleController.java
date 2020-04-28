package com.duanwl.cms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duanwl.cms.domain.Article;
import com.duanwl.cms.service.ArticleService;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: ArticaleController 
 * @Description: controller
 * @author: 段文龙
 * @date: 2020年4月28日 下午5:24:07
 */
@Controller
public class ArticaleController {
	
	@Resource
	private ArticleService articleService;
	/**
	 * 
	 * @Title: index 
	 * @Description: 进入个人中心首页
	 * @return
	 * @return: String
	 */
	@RequestMapping("index")
	public String index() {
		
		return "my/index";
	}
	
	/**
	 * 
	 * @Title: articles 
	 * @Description: 我的文章
	 * @param model
	 * @param article
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping("articles")
	public String articles(Model model,Article article,@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "6")Integer pageSize){
		
		PageInfo<Article> info = articleService.selects(article, pageNum, pageSize);
		model.addAttribute("info", info);
		return "my/articles";
	
	}
	
}
