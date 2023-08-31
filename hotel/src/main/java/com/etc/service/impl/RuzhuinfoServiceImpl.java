package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Ruzhuinfo;
import com.etc.dao.RuzhuinfoDao;
import com.etc.service.RuzhuinfoService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class RuzhuinfoServiceImpl implements RuzhuinfoService {
	@Autowired
	private RuzhuinfoDao rzinfoDao;
	public void insert(Ruzhuinfo rzinfo){
		rzinfoDao.insert(rzinfo);
	}
	public void update(Ruzhuinfo rzinfo){
		rzinfoDao.update(rzinfo);
	}
	public void delete(Integer id){
		rzinfoDao.delete(id);
	}
	public Ruzhuinfo selectOne(Integer id){
		return rzinfoDao.selectOne(id);
	}
	public List selectList(){
		return rzinfoDao.selectList();
	}
	public int totalPage(int line) {
		int total = rzinfoDao.total();
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
		return rzinfoDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		rzinfoDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return rzinfoDao.selectByProperty(map);
	}
	public int selectTotal() {
		return rzinfoDao.total();
	}
}
