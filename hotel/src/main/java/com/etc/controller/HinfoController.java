package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Hinfo;
import com.etc.service.HinfoService;

@RestController
@RequestMapping("/hinfo")
public class HinfoController {
	
	@Autowired
	private HinfoService hinfoService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Hinfo hinfo){
		try {
			hinfoService.insert(hinfo);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Hinfo hinfo){
		try {
			hinfoService.update(hinfo);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer hid){
		try {
			hinfoService.delete(hid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Hinfo selectOne(Integer hid){
		Hinfo hinfo = null;
		try {
			hinfo = hinfoService.selectOne(hid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hinfo;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List hinfos = null;
		try {
			hinfos = hinfoService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hinfos;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] hids){
		try {
			hinfoService.deleteList(hids);
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
			total = hinfoService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = hinfoService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = hinfoService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = hinfoService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
