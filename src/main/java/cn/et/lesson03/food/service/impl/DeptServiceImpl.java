package cn.et.lesson03.food.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson03.food.dao.DeptMapper;
import cn.et.lesson03.food.entity.Dept;
import cn.et.lesson03.food.entity.DeptExample;
import cn.et.lesson03.food.entity.TreeNode;
import cn.et.lesson03.food.service.DeptService;
import cn.et.lesson03.food.service.EmpService;
@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	DeptMapper dm;
	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.dept.service.impl.DeptService#queryStudent(java.lang.Integer)
	 */
	public List<TreeNode> queryTreeNodes(Integer pid){
		DeptExample de = new DeptExample();
		de.createCriteria().andPidEqualTo(pid);
		List<Dept> depts = dm.selectByExample(de);
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (Dept dept : depts) {
			TreeNode tn = new TreeNode();
			tn.setId(dept.getId());
			tn.setText(dept.getDname());
			//�жϵ�ǰ�ڵ��Ƿ񻹴����ӽڵ�
			if (queryTreeNodes(dept.getId()).size()==0) {
				tn.setState("open");
			}
			treeNodes.add(tn);
		}
		return treeNodes;
	}
}
