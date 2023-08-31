package com.etc.dao;
import com.etc.model.Lianxi;
import java.util.List;
public interface LianxiDao extends BaseDao {
	public void insert(Lianxi lianxi);
	public void update(Lianxi lianxi);
	public void delete(Integer lxid);
	public Lianxi selectOne(Integer lxid);
	public List selectList();
}
