package com.etc.dao;
import com.etc.model.Types;
import java.util.List;
public interface TypesDao extends BaseDao {
	public void insert(Types types);
	public void update(Types types);
	public void delete(Integer tid);
	public Types selectOne(Integer tid);
	public List selectList();
}
