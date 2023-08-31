package com.etc.service;
import com.etc.model.Lunbo;
import java.util.List;
public interface LunboService {
	public void insert(Lunbo lunbo);
	public void update(Lunbo lunbo);
	public void delete(Integer lid);
	public Lunbo selectOne(Integer lid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
