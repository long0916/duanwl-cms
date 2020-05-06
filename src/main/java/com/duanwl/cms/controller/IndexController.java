package com.duanwl.cms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duanwl.cms.domain.Channel;
import com.duanwl.cms.service.ChannelService;

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
	/**
	 * 
	 * @Title: index 
	 * @Description: 进入系统首页
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = {"","/","index"})
	public String index(Model model) {
		
		//1.查询所有的栏目
		List<Channel> channels = channelService.selects();
		model.addAttribute("channels", channels);
		return "index/index";
		
	}
}
