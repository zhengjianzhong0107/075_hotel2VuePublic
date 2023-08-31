package com.etc.controller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Types;
import com.etc.service.TypesService;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/types")
public class TypesController {
	
	@Autowired
	private TypesService typesService;

	private static final String FILE_PATH = "E:\\educationProject\\酒店管理系统\\vue\\hotel\\hotelweb\\images";
	
	@RequestMapping("/insert")
	public String insert( Types types, MultipartFile upload){
		try {
			//获取文件名
			String name = upload.getOriginalFilename();
			System.out.println("name:"+name);

			Date date = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
			String str = sf.format(date);
			//str += types.getTid();
			String str1 = name.substring(name.lastIndexOf("."));
			name = str+str1;
			System.out.println("name:"+name);

			//文件上传的路径
			String path = FILE_PATH;
			System.out.println("path:"+path);
//			创建文件
			File file = new File(path, name);
			upload.transferTo(file);

			types.setImage(name);
			typesService.insert(types);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update( Types types,MultipartFile upload){
		try {
			//获取文件名
			String name = upload.getOriginalFilename();
			System.out.println("name:"+name);

			Date date = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
			String str = sf.format(date);
			//str += types.getTid();
			String str1 = name.substring(name.lastIndexOf("."));
			name = str+str1;
			System.out.println("name:"+name);

			//文件上传的路径
			String path = FILE_PATH;
			System.out.println("path:"+path);
//			创建文件
			File file = new File(path, name);
			upload.transferTo(file);

			types.setImage(name);
			typesService.update(types);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer tid){
		try {
			typesService.delete(tid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Types selectOne(Integer tid){
		Types types = null;
		try {
			types = typesService.selectOne(tid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return types;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List typess = null;
		try {
			typess = typesService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return typess;
	}
	@RequestMapping("/deleteList")
	public String deleteList(String[] tids){
		try {
			typesService.deleteList(tids);
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
			total = typesService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = typesService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = typesService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = typesService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
