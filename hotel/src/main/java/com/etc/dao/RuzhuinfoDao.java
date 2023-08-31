package com.etc.dao;
import com.etc.model.Ruzhuinfo;
import java.util.List;
public interface RuzhuinfoDao extends BaseDao {
	public void insert(Ruzhuinfo rzinfo);
	public void update(Ruzhuinfo rzinfo);
	public void delete(Integer id);
	public Ruzhuinfo selectOne(Integer id);
	public List selectList();
}
