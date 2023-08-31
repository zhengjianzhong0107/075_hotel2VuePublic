package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Hinfo;
import com.etc.dao.HinfoDao;
import com.etc.service.HinfoService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class HinfoServiceImpl implements HinfoService {
	@Autowired
	private HinfoDao hinfoDao;
	public void insert(Hinfo hinfo){
		hinfoDao.insert(hinfo);
	}
	public void update(Hinfo hinfo){
		hinfoDao.update(hinfo);
	}
	public void delete(Integer hid){
		hinfoDao.delete(hid);
	}
	public Hinfo selectOne(Integer hid){
		return hinfoDao.selectOne(hid);
	}
	public List selectList(){
		return hinfoDao.selectList();
	}
	public int totalPage(int line) {
		int total = hinfoDao.total();
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
		return hinfoDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		hinfoDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return hinfoDao.selectByProperty(map);
	}
	public int selectTotal() {
		return hinfoDao.total();
	}
}
