package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.model.Admin;
import com.etc.dao.AdminDao;
import com.etc.service.AdminService;
import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	public Admin selectOne(String loginid){
		return adminDao.selectOne(loginid);
	}
}
