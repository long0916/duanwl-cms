package com.duanwl.cms.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duanwl.cms.domain.Article;
import com.duanwl.cms.domain.Category;
import com.duanwl.cms.domain.Channel;
import com.duanwl.cms.domain.Slide;
import com.duanwl.cms.service.ArticleService;
import com.duanwl.cms.service.ChannelService;
import com.duanwl.cms.service.SlideService;
import com.duanwl.common.utils.DateUtil;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: IndexController 
 * @Description: 系统controller
 * @author: 段文龙
 * @date: 2020年5月6日 下午7:27:03
 */
@Controller
public class IndexController {
	
	@Resource
	private ChannelService channelService;
	@Resource
	private ArticleService articleService;
	@Resource
	private SlideService slideService;
	/**
	 * 
	 * @Title: index 
	 * @Description: 进入系统首页
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = {"","/","index"})
	public String index(Model model,Article article,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "5")Integer pageSize) {
		
		model.addAttribute("article", article);//封装查询条件
		
		//1.查询所有的栏目
		List<Channel> channels = channelService.selects();
		model.addAttribute("channels", channels);
		//2.根据栏目id查询所有分类
		List<Category> categorys = channelService.selectCategorysByChannelId(article.getChannelId());
		model.addAttribute("categorys", categorys);
		//3.查询栏目下的文章
		if(article.getChannelId()!=null) {
			PageInfo<Article> info = articleService.selects(article, pageNum, pageSize);
			model.addAttribute("info", info);
		}
		//4.显示热点文章
		if(article.getChannelId()==null) {
			article.setHot(1);//热点文章
			PageInfo<Article> info = articleService.selects(article, pageNum, pageSize);
			model.addAttribute("info", info);
			//广告
			List<Slide> slides = slideService.selects();
			model.addAttribute("slides", slides);
		}
		//5 右侧边栏显示24小内容的热点文章
		 Article article2 = new Article();
		 article2.setHot(1);//热点文章
		 article2.setCreated(DateUtil.SubDate(new Date(), 24));//把当前系统时间减去24 个小时
		 
		PageInfo<Article> hot24Articles = articleService.selects(article2, 1, 5);
		model.addAttribute("hot24Articles", hot24Articles);
		
		
		return "index/index";
	}
	
	@RequestMapping("articleDetail")
	public String articaleDetail(Integer id,Model model) {
		Article article = articleService.select(id);
		model.addAttribute("article", article);
		return "index/articaleDetail";
	}
	
}
