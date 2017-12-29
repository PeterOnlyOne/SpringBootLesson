package cn.et.lesson03.food.service;

import java.util.List;

import cn.et.lesson03.food.entity.Emp;

public interface EmpService {

	public List<Emp> queryEmps(Integer id);
}