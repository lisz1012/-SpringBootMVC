package com.lisz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lisz.entity.City;
//这里就不用写@Repository注解了，写了也不错     指定装配类型和主键类型
public interface CityDao extends JpaRepository<City, Integer> { //用Spring Data JPA的话，这里得是接口 QuerydslJpaRepository, SimpleJpaRepository实现了这个接口

	//List<City> findAll();

}
