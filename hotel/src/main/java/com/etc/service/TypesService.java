package com.etc.service;
import com.etc.model.Types;
import java.util.List;
public interface TypesService {
	public void insert(Types types);
	public void update(Types types);
	public void delete(Integer tid);
	public Types selectOne(Integer tid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
