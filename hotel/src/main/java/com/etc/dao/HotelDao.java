package com.etc.dao;
import com.etc.model.Hotel;
import java.util.List;
public interface HotelDao extends BaseDao {
	public void insert(Hotel hotel);
	public void update(Hotel hotel);
	public void delete(Integer hid);
	public Hotel selectOne(Integer hid);
	public List selectList();
}
