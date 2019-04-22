package com.yyt.weixinchengxu.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.weixinchengxu.dao.weixinUserMapper;
import com.yyt.weixinchengxu.entity.weixinUser;
import com.yyt.weixinchengxu.service.weixinUserServie;

@Service
public class weixinUserServiceImpl implements weixinUserServie {
	
	@Autowired
	weixinUserMapper weixinUserMapper;

	@Override
	@Transactional
	public int insertone(weixinUser user) {
		int rn=weixinUserMapper.insert(user);
		if(user.getSex()) {
			throw new RuntimeException();
		}else {
			
		}
		return rn;
	}

	@Override
	public int deletebyid(int id) {
		
		return weixinUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updatebyid(weixinUser user) {
		
		return weixinUserMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public weixinUser selectbyid(int id) {
		
		return weixinUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<weixinUser> selectall() {
		// TODO Auto-generated method stub
		return null;
	}

}
