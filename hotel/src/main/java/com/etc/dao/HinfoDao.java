package com.etc.dao;
import com.etc.model.Hinfo;
import java.util.List;
public interface HinfoDao extends BaseDao {
	public void insert(Hinfo hinfo);
	public void update(Hinfo hinfo);
	public void delete(Integer hid);
	public Hinfo selectOne(Integer hid);
	public List selectList();
}
