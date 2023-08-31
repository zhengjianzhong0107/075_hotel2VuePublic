package com.etc.service;
import com.etc.model.Horder;
import java.util.List;
public interface HorderService {
	public void insert(Horder horder);
	public void update(Horder horder);
	public void delete(String oid);
	public Horder selectOne(String oid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();

    int selectYuNum(Horder horder);

    List selectUserId(String userid);
}
