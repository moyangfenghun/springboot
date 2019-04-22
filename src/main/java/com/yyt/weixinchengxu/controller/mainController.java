package com.yyt.weixinchengxu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyt.weixinchengxu.entity.weixinUser;
import com.yyt.weixinchengxu.service.weixinUserServie;

@Controller
@RequestMapping(value="weixinCXContent")
public class mainController {
	@Autowired
	weixinUserServie weixinUserServie;
	
	@RequestMapping(value="addweixinUser",method=RequestMethod.GET)
	@ResponseBody
	public weixinUser addweixinUser() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=null;
		try {
			date=dateFormat.parse("1996-05-31 12:00:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		weixinUser user=new weixinUser();
		user.setBirthday(date);
		user.setName("yt");
		user.setPhone("15123810095");
		user.setPresentation("燃烧殆尽总好过黯然失色");
		user.setSex(true);
		weixinUserServie.insertone(user);
		System.out.println(user.getId());
		return user;
	}
	
	
}
