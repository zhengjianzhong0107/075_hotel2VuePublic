package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Lianxi;
import com.etc.dao.LianxiDao;
import com.etc.service.LianxiService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class LianxiServiceImpl implements LianxiService {
	@Autowired
	private LianxiDao lianxiDao;
	public void insert(Lianxi lianxi){
		lianxiDao.insert(lianxi);
	}
	public void update(Lianxi lianxi){
		lianxiDao.update(lianxi);
	}
	public void delete(Integer lxid){
		lianxiDao.delete(lxid);
	}
	public Lianxi selectOne(Integer lxid){
		return lianxiDao.selectOne(lxid);
	}
	public List selectList(){
		return lianxiDao.selectList();
	}
	public int totalPage(int line) {
		int total = lianxiDao.total();
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
		return lianxiDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		lianxiDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return lianxiDao.selectByProperty(map);
	}
	public int selectTotal() {
		return lianxiDao.total();
	}
}
