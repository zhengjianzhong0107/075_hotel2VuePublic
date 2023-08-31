package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Users;
import com.etc.dao.UsersDao;
import com.etc.service.UsersService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDao userDao;
	public void insert(Users user){
		userDao.insert(user);
	}
	public void update(Users user){
		userDao.update(user);
	}
	public void delete(String utel){
		userDao.delete(utel);
	}
	public Users selectOne(String utel){
		return userDao.selectOne(utel);
	}
	public List selectList(){
		return userDao.selectList();
	}
	public int totalPage(int line) {
		int total = userDao.total();
		int totalpage = total/line;
		if(total%line>0){
			totalpage++;
		}
		return totalpage;
	}
	public List selectByPage(int page, int line) {
		HashMap map = new HashMap();
		map.put("min", (page-1)*line);
		map.put("max", line);
		return userDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		userDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return userDao.selectByProperty(map);
	}
	public int selectTotal() {
		return userDao.total();
	}
}
