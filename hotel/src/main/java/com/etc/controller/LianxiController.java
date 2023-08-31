package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Lianxi;
import com.etc.service.LianxiService;

@RestController
@RequestMapping("/lianxi")
public class LianxiController {
	
	@Autowired
	private LianxiService lianxiService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Lianxi lianxi){
		try {
			lianxiService.insert(lianxi);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Lianxi lianxi){
		try {
			lianxiService.update(lianxi);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer lxid){
		try {
			lianxiService.delete(lxid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Lianxi selectOne(Integer lxid){
		Lianxi lianxi = null;
		try {
			lianxi = lianxiService.selectOne(lxid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lianxi;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List lianxis = null;
		try {
			lianxis = lianxiService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lianxis;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] lxids){
		try {
			lianxiService.deleteList(lxids);
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
			total = lianxiService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = lianxiService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = lianxiService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = lianxiService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
