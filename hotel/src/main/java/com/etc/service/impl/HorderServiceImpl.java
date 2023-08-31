package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Horder;
import com.etc.dao.HorderDao;
import com.etc.service.HorderService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class HorderServiceImpl implements HorderService {
	@Autowired
	private HorderDao horderDao;
	public void insert(Horder horder){
		horderDao.insert(horder);
	}
	public void update(Horder horder){
		horderDao.update(horder);
	}
	public void delete(String oid){
		horderDao.delete(oid);
	}
	public Horder selectOne(String oid){
		return horderDao.selectOne(oid);
	}
	public List selectList(){
		return horderDao.selectList();
	}
	public int totalPage(int line) {
		int total = horderDao.total();
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
		return horderDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		horderDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return horderDao.selectByProperty(map);
	}
	public int selectTotal() {
		return horderDao.total();
	}

	@Override
	public int selectYuNum(Horder horder) {
		// TODO Auto-generated method stub
		return horderDao.selectYuNum(horder);
	}

	@Override
	public List selectUserId(String userid) {
		return horderDao.selectUserId(userid);
	}
}
