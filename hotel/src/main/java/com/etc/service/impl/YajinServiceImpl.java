package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Yajin;
import com.etc.dao.YajinDao;
import com.etc.service.YajinService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class YajinServiceImpl implements YajinService {
	@Autowired
	private YajinDao yajinDao;
	public void insert(Yajin yajin){
		yajinDao.insert(yajin);
	}
	public void update(Yajin yajin){
		yajinDao.update(yajin);
	}
	public void delete(Integer oid){
		yajinDao.delete(oid);
	}
	public Yajin selectOne(Integer oid){
		return yajinDao.selectOne(oid);
	}
	public List selectList(){
		return yajinDao.selectList();
	}
	public int totalPage(int line) {
		int total = yajinDao.total();
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
		return yajinDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		yajinDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return yajinDao.selectByProperty(map);
	}
	public int selectTotal() {
		return yajinDao.total();
	}

	@Override
	public int updateTui(Yajin yajin) {
		return yajinDao.updateTui(yajin);
	}
}
