package com.duanwl.cms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duanwl.cms.domain.Article;
import com.duanwl.cms.domain.Category;
import com.duanwl.cms.domain.Channel;
import com.duanwl.cms.service.ArticleService;
import com.duanwl.cms.service.ChannelService;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: ArticaleController 
 * @Description:  个人中心
 * @author: 段文龙
 * @date: 2020年4月28日 下午5:24:07
 */
@RequestMapping("my")
@Controller
public class ArticaleController {
	
	@Resource
	private ArticleService articleService;
	@Resource
	private ChannelService channelService;
	/**
	 * 
	 * @Title: index 
	 * @Description: 进入个人中心首页
	 * @return
	 * @return: String
	 * 地址栏可以输入my  my/   my/index
	 */
	@RequestMapping(value = {"","/","index"})
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
	
	/**
	 * 
	 * @Title: publish 
	 * @Description: 去发布文章
	 * @return
	 * @return: String
	 */
	@GetMapping("publish")
	public String publish() {
		return "my/publish";
	}
	/**
	 * 
	 * @Title: bublish 
	 * @Description: 执行发布文章
	 * @return
	 * @return: boolean
	 */
	@ResponseBody
	@PostMapping("publish")
	public boolean bublish(Article article) {
		return articleService.insert(article)>0;
	}
	
	
	/**
	 * 
	 * @Title: article 
	 * @Description: 文章详情
	 * @param id
	 * @return
	 * @return: Article
	 */
	@ResponseBody
	@RequestMapping("article")
	public Article article(Integer id) {
		return articleService.select(id);
	}
	/**
	 * 
	 * @Title: channels 
	 * @Description: 查询所有的分类
	 * @return
	 * @return: List<Channel>
	 */
	@ResponseBody
	@RequestMapping("channels")
	public List<Channel> channels(){
		return channelService.selects();
	}
	
	/**
	 * 
	 * @Title: categorys
	 * @Description: 根据栏目查询分类
	 * @param channelId
	 * @return
	 * @return: List<Category>
	 */
	@ResponseBody
	@RequestMapping("selectCategorysByChannelId")
	public List<Category> categorys(Integer channelId) {
		return channelService.selectCategorysByChannelId(channelId);
	}
	
	
	
}
