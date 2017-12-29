package cn.et.lesson02.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson02.entity.Food;
import cn.et.lesson02.service.FoodService;

@RestController
public class SbController {

	@Autowired
	DataSource dataSource;
	@Autowired
	FoodService service;
	
	@RequestMapping("/dataSource")
	public String dataSource(){
		return dataSource.toString();
	}
	
	@RequestMapping("/queryFoodAll")
	public List<Food> queryFoodAll(){
		return service.queryFood();
	}
	
	@RequestMapping("/queryFood/{foodId}")
	public Food queryFoodById(@PathVariable int foodId){
		return service.queryFoodById(foodId);
	}
}
