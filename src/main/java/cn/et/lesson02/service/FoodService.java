package cn.et.lesson02.service;

import java.util.List;

import cn.et.lesson02.entity.Food;

public interface FoodService {

	List<Food> queryFood();

	Food queryFoodById(int id);

}