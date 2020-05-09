package com.duanwl.cms.service;

import java.util.List;

import com.duanwl.cms.domain.Comments;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: CommentsService 
 * @Description: 评论Service接口
 * @author: 段文龙
 * @date: 2020年5月9日 下午6:10:30
 */
public interface CommentsService {
	/**
	 * 
	 * @Title: insert 
	 * @Description: 增加评论
	 * @param comments
	 * @return
	 * @return: int
	 */
	boolean insert(Comments comments);
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询某个文章的评论
	 * @param articleId
	 * @return
	 * @return: List<Comments>
	 */
	PageInfo<Comments> selects(Integer articleId,Integer pageNum,Integer pageSize);
}
