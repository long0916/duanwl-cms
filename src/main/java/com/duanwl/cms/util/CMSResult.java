package com.duanwl.cms.util;
/**
 * 
 * @ClassName: CMSResult 
 * @Description: 返回统一的结果值
 * @author: 段文龙
 * @date: 2020年5月8日 下午7:05:52 
 * @param <T>
 */
public class CMSResult<T> {
   //返回结果的状态
	private Integer code;
	private String  msg;
	private T data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
