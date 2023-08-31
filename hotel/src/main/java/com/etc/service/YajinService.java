package com.etc.service;
import com.etc.model.Yajin;
import java.util.List;
public interface YajinService {
	public void insert(Yajin yajin);
	public void update(Yajin yajin);
	public void delete(Integer oid);
	public Yajin selectOne(Integer oid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();

    int updateTui(Yajin yajin);
}
