package com.etc.dao;
import com.etc.model.Users;
import java.util.List;
public interface UsersDao extends BaseDao {
	public void insert(Users user);
	public void update(Users user);
	public void delete(String utel);
	public Users selectOne(String utel);
	public List selectList();
}
