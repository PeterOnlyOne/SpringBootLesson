package cn.et.lesson02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson02.entity.Food;
import cn.et.lesson02.mapper.FoodMapper;
import cn.et.lesson02.service.FoodService;
@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	FoodMapper fm;
	/* (non-Javadoc)
	 * @see cn.et.lesson02.service.impl.FoodService#queryFood()
	 */
	@Override
	public  List<Food> queryFood(){
		return fm.queryFood();
	} 
	
	/* (non-Javadoc)
	 * @see cn.et.lesson02.service.impl.FoodService#queryFoodById(int)
	 */
	@Override
	public Food queryFoodById(int id){
		return fm.queryFoodById(id);
	}
}
