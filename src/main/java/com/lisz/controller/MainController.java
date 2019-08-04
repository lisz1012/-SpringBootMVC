package com.lisz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lisz.entity.City;
import com.lisz.service.CityService;

@Controller
@RequestMapping("/city")
public class MainController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<City> list = cityService.findAll();
		model.addAttribute("list", list); //传前端与勉励去
		return "list";
	}
	
	@GetMapping("/list/{id}") // 访问: http://localhost/city/list/1 
	public String list(@PathVariable("id") Integer id, Model model) {
		City city = cityService.findById(id);
		model.addAttribute("city", city);
		return "one";
	}
}
