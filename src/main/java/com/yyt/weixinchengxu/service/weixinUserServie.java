package com.yyt.weixinchengxu.service;

import java.util.List;

import com.yyt.weixinchengxu.entity.weixinUser;

public interface weixinUserServie {
	
	public int insertone(weixinUser user);
	
	public int deletebyid(int id);
	
	public int updatebyid(weixinUser user);
	
	public weixinUser selectbyid(int id);
	
	public List<weixinUser> selectall();
}
