package com.etc.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao {
	public int total();
	public List selectByPage(Map map);
	public void deleteList(String [] ids);
	public List selectByProperty(Map map);
}
