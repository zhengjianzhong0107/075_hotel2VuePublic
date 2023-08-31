package com.etc.dao;
import com.etc.model.Lunbo;
import java.util.List;
public interface LunboDao extends BaseDao {
	public void insert(Lunbo lunbo);
	public void update(Lunbo lunbo);
	public void delete(Integer lid);
	public Lunbo selectOne(Integer lid);
	public List selectList();
}
