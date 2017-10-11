package com.example.demo.dao;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Config;

@Component  
public class ConfigRepository {

	public Config findOne(Long id) {
		Config c = new Config();
		c.setId(1L);
		c.setCron("0 0/2 * * * ?");
		return c;
	}
}
