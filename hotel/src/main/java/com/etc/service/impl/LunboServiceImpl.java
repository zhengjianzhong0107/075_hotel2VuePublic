package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Lunbo;
import com.etc.dao.LunboDao;
import com.etc.service.LunboService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class LunboServiceImpl implements LunboService {
	@Autowired
	private LunboDao lunboDao;
	public void insert(Lunbo lunbo){
		lunboDao.insert(lunbo);
	}
	public void update(Lunbo lunbo){
		lunboDao.update(lunbo);
	}
	public void delete(Integer lid){
		lunboDao.delete(lid);
	}
	public Lunbo selectOne(Integer lid){
		return lunboDao.selectOne(lid);
	}
	public List selectList(){
		return lunboDao.selectList();
	}
	public int totalPage(int line) {
		int total = lunboDao.total();
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
		return lunboDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		lunboDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return lunboDao.selectByProperty(map);
	}
	public int selectTotal() {
		return lunboDao.total();
	}
}
