package com.etc.dao;
import com.etc.model.Yajin;
import java.util.List;
public interface YajinDao extends BaseDao {
	public void insert(Yajin yajin);
	public void update(Yajin yajin);
	public void delete(Integer oid);
	public Yajin selectOne(Integer oid);
	public List selectList();

    int updateTui(Yajin yajin);
}
