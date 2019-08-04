package com.lisz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisz.dao.CityDao;
import com.lisz.entity.City;

@Service
public class CityService {

	@Autowired
	private CityDao cityDao;
	
	public List<City> findAll() {
		List<City> list = cityDao.findAll();
		return list;
	}
	
}
