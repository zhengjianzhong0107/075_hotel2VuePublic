package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Ruzhuinfo;
import com.etc.service.RuzhuinfoService;

@RestController
@RequestMapping("/rzinfo")
public class RuzhuinfoController {
	
	@Autowired
	private RuzhuinfoService rzinfoService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Ruzhuinfo rzinfo){
		try {
			rzinfoService.insert(rzinfo);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Ruzhuinfo rzinfo){
		try {
			rzinfoService.update(rzinfo);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer id){
		try {
			rzinfoService.delete(id);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Ruzhuinfo selectOne(Integer id){
		Ruzhuinfo rzinfo = null;
		try {
			rzinfo = rzinfoService.selectOne(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rzinfo;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List rzinfos = null;
		try {
			rzinfos = rzinfoService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rzinfos;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] ids){
		try {
			rzinfoService.deleteList(ids);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/totalPage")
	public int totalPage(int line){
		int total = 0;
		try {
			total = rzinfoService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = rzinfoService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = rzinfoService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = rzinfoService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
