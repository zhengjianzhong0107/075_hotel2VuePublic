package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Hotel;
import com.etc.dao.HotelDao;
import com.etc.service.HotelService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelDao hotelDao;
	public void insert(Hotel hotel){
		hotelDao.insert(hotel);
	}
	public void update(Hotel hotel){
		hotelDao.update(hotel);
	}
	public void delete(Integer hid){
		hotelDao.delete(hid);
	}
	public Hotel selectOne(Integer hid){
		return hotelDao.selectOne(hid);
	}
	public List selectList(){
		return hotelDao.selectList();
	}
	public int totalPage(int line) {
		int total = hotelDao.total();
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
		return hotelDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		hotelDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return hotelDao.selectByProperty(map);
	}
	public int selectTotal() {
		return hotelDao.total();
	}
}
