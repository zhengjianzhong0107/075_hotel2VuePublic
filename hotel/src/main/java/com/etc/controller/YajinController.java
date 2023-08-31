package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Yajin;
import com.etc.service.YajinService;

@RestController
@RequestMapping("/yajin")
public class YajinController {
	
	@Autowired
	private YajinService yajinService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Yajin yajin){
		try {
			yajinService.insert(yajin);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Yajin yajin){
		try {
			yajinService.update(yajin);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/updateTui")
	public String updateTui(@RequestBody Yajin yajin){
		try {
			yajinService.updateTui(yajin);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}

	@RequestMapping("/delete")
	public String delete(Integer oid){
		try {
			yajinService.delete(oid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Yajin selectOne(Integer oid){
		Yajin yajin = null;
		try {
			yajin = yajinService.selectOne(oid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yajin;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List yajins = null;
		try {
			yajins = yajinService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yajins;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] oids){
		try {
			yajinService.deleteList(oids);
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
			total = yajinService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = yajinService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = yajinService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = yajinService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
