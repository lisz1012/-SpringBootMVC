package com.lisz.controller;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lisz.entity.Account;
import com.lisz.entity.City;
import com.lisz.service.AccountService;
import com.lisz.service.CityService;

@Controller
@RequestMapping("/city")
public class MainController {
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Account> accounts = accountService.list();
		System.out.println(accountService.count());
		for (Account account : accounts) {
			System.out.println(ToStringBuilder.reflectionToString(account, ToStringStyle.MULTI_LINE_STYLE));
		}
		
		model.addAttribute("list", accounts);
		return "list";
	}
	
	@GetMapping("/list/{id}") // 访问: http://localhost/city/list/1 
	public String list(@PathVariable("id") Integer id, Model model) { //id变量名跟上面{}里面的一样的话可以不写("id")
		City city = cityService.findById(id);
		model.addAttribute("city", city);
		return "one";
	}
}
