package com.etc.service;
import com.etc.model.Ruzhuinfo;
import java.util.List;
public interface RuzhuinfoService {
	public void insert(Ruzhuinfo rzinfo);
	public void update(Ruzhuinfo rzinfo);
	public void delete(Integer id);
	public Ruzhuinfo selectOne(Integer id);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
