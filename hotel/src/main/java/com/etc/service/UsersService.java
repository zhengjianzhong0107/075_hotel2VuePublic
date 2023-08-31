package com.etc.service;
import com.etc.model.Users;
import java.util.List;
public interface UsersService {
	public void insert(Users user);
	public void update(Users user);
	public void delete(String utel);
	public Users selectOne(String utel);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
