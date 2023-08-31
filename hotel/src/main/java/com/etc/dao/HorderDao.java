package com.etc.dao;
import com.etc.model.Horder;
import java.util.List;
public interface HorderDao extends BaseDao {
	public void insert(Horder horder);
	public void update(Horder horder);
	public void delete(String oid);
	public Horder selectOne(String oid);
	public List selectList();

    int selectYuNum(Horder horder);

    List selectUserId(String userid);
}
