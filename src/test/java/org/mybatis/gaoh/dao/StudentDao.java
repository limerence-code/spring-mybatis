package org.mybatis.gaoh.dao;


import org.mybatis.gaoh.model.StudentModel;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: gaoh
 * @Date: 2021/3/28 22:53
 * @Version: 1.0
 */
public interface StudentDao {

	List<Map<String, Object>> list();

	int insert(StudentModel student);

	int delete(Integer id);
}
