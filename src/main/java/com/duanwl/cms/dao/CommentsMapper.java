package com.duanwl.cms.dao;

import java.util.List;

import com.duanwl.cms.domain.Comments;

/**
 * 
 * @ClassName: CommentsMapper 
 * @Description: 评论接口
 * @author: 段文龙
 * @date: 2020年5月9日 下午5:55:45
 */
public interface CommentsMapper {
	/**
	 * 
	 * @Title: insert 
	 * @Description: 增加评论
	 * @param comments
	 * @return
	 * @return: int
	 */
	int insert(Comments comments);
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询某个文章的评论
	 * @param articleId
	 * @return
	 * @return: List<Comments>
	 */
	List<Comments> selects(Integer articleId);
	/**
	 * 
	 * @Title: updateArticle 
	 * @Description: 更新文章表的评论数量
	 * @param articleId
	 * @return
	 * @return: int
	 */
	int updateArticle(Integer articleId);
}
