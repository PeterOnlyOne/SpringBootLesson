package cn.et.lesson03.food.service;

import java.util.List;

import cn.et.lesson03.food.entity.TreeNode;

public interface DeptService {

	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	public abstract List<TreeNode> queryTreeNodes(Integer pid);

}