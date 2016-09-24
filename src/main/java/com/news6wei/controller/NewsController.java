package com.news6wei.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.news6wei.dao.NewsDao;

@Controller
@EnableAutoConfiguration
public class NewsController {

	@Autowired
	NewsDao newsDao;

	@RequestMapping("/service")
	@ResponseBody
	public List<String> service() {
		List<String> list = new ArrayList<String>();
		list.add("太宰");
		list.add("夏目");
		return list;
	}
}
