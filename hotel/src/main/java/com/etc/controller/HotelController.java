package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Hotel;
import com.etc.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Hotel hotel){
		try {
			hotelService.insert(hotel);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Hotel hotel){
		try {
			hotelService.update(hotel);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer hid){
		try {
			hotelService.delete(hid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Hotel selectOne(Integer hid){
		Hotel hotel = null;
		try {
			hotel = hotelService.selectOne(hid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hotel;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List hotels = null;
		try {
			hotels = hotelService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hotels;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] hids){
		try {
			hotelService.deleteList(hids);
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
			total = hotelService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = hotelService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = hotelService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = hotelService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
