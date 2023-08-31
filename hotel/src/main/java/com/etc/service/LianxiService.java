package com.etc.service;
import com.etc.model.Lianxi;
import java.util.List;
public interface LianxiService {
	public void insert(Lianxi lianxi);
	public void update(Lianxi lianxi);
	public void delete(Integer lxid);
	public Lianxi selectOne(Integer lxid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
