package com.etc.service;
import com.etc.model.Hotel;
import java.util.List;
public interface HotelService {
	public void insert(Hotel hotel);
	public void update(Hotel hotel);
	public void delete(Integer hid);
	public Hotel selectOne(Integer hid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
