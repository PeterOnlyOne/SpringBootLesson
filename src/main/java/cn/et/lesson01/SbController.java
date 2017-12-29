package cn.et.lesson01;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson01.dao.FoodRepository;

@RestController
@SpringBootApplication
public class SbController {

	@Autowired
	JdbcTemplate jdbc;
	@Autowired 
	FoodRepository fr;
	
	@RequestMapping("/food/{foodId}")
	public Map queryFood(@PathVariable String foodId){
		List<Map<String, Object>> queryForList = jdbc.queryForList("select * from food where foodid="+foodId);
		return queryForList.get(0);
	} 
	
	@RequestMapping("/saveFood")
	public Food saveFood(){
		Food food = new Food();
		food.setFoodname("土豆丝");
		food.setPrice(7.0);
		food.setImagepath("potato.png");
		
		return fr.save(food);
	} 
	
	@RequestMapping("/queryFood")
	public Food queryFood(){
		return fr.findOne(3);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SbController.class, args);
	}
}
