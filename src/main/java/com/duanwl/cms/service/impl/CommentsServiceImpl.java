package com.duanwl.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanwl.cms.dao.CommentsMapper;
import com.duanwl.cms.domain.Comments;
import com.duanwl.cms.service.CommentsService;
import com.duanwl.cms.util.CMSException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: CommentsServiceImpl 
 * @Description: 评论Service接口的实现类
 * @author: 段文龙
 * @date: 2020年5月9日 下午6:11:54
 */
@Service
public class CommentsServiceImpl implements CommentsService{

	@Resource
	private CommentsMapper commentsMapper;
	@Override
	public boolean insert(Comments comments) {
		try {
			//1.增加基评论表
			commentsMapper.insert(comments);
			//2.更新文章表的comments字段，数值递增1
			commentsMapper.updateArticle(comments.getArticleId());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CMSException("评论失败");
		}

	}

	@Override
	public PageInfo<Comments> selects(Integer articleId, Integer pageNum, Integer pageSize) {
		  PageHelper.startPage(pageNum, pageSize);
		  List<Comments> list = commentsMapper.selects(articleId);
		  return new PageInfo<Comments>(list);
	}

}
