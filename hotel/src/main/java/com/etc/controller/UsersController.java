package com.etc.controller;
import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Users;
import com.etc.service.UsersService;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UsersService userService;
	private static final String FILE_PATH = "E:\\educationProject\\酒店管理系统\\vue\\hotel\\hotelweb\\images";


	@RequestMapping("/insert")
	public String insert(MultipartFile file, Users user){
		try {
			if(file!=null){
				String n = file.getOriginalFilename();
				File file1 = new File(FILE_PATH,n);
				file.transferTo(file1);
				System.out.println("上传成功");
				user.setUphoto(n);
			}
			if(file==null){
				user.setUphoto("1.jpg");
			}
			userService.insert(user);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(MultipartFile file,Users user){
		try {
			if(file!=null){
				String n = file.getOriginalFilename();
				File file1 = new File(FILE_PATH,n);
				file.transferTo(file1);
				System.out.println("上传成功");
				user.setUphoto(n);
			}
			System.out.println("user:"+user);
			userService.update(user);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(String utel){
		try {
			userService.delete(utel);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Users selectOne(String utel){
		Users user = null;
		try {
			user = userService.selectOne(utel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	@RequestMapping("/login")
	public Users login(@RequestBody Users u){
		Users user = null;
		try {
			user = userService.selectOne(u.getUtel());
			if(user!=null && user.getUpwd().equals(u.getUpwd())){
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List users = null;
		try {
			users = userService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] utels){
		try {
			userService.deleteList(utels);
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
			total = userService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = userService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = userService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = userService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
