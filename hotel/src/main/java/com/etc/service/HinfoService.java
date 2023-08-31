package com.etc.service;
import com.etc.model.Hinfo;
import java.util.List;
public interface HinfoService {
	public void insert(Hinfo hinfo);
	public void update(Hinfo hinfo);
	public void delete(Integer hid);
	public Hinfo selectOne(Integer hid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
