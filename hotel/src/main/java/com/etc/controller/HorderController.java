package com.etc.controller;
import java.util.List;

import com.etc.util.OidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Horder;
import com.etc.service.HorderService;

@RestController
@RequestMapping("/horder")
public class HorderController {
	
	@Autowired
	private HorderService horderService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Horder horder){
		try {
			horder.setOid(OidUtil.getOid(horder.getUserid()));
			horderService.insert(horder);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectUserId")
	public List selectUserId(String userid){
		List horders = null;
		try {
			horders = horderService.selectUserId(userid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horders;
	}
	@RequestMapping("/update")
	public String update(@RequestBody Horder horder){
		try {
			horderService.update(horder);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(String oid){
		try {
			horderService.delete(oid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Horder selectOne(String oid){
		Horder horder = null;
		try {
			horder = horderService.selectOne(oid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horder;
	}
	@RequestMapping("/selectYuNum")
	public int selectYuNum(@RequestBody Horder horder) {
		int total = 0;
		try {
			System.out.println("horder:"+horder);
			total = horderService.selectYuNum(horder);
			System.out.println(total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List horders = null;
		try {
			horders = horderService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horders;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] oids){
		try {
			horderService.deleteList(oids);
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
			total = horderService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = horderService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = horderService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = horderService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
