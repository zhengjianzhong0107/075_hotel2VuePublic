package com.etc.controller;


import com.etc.model.Admin;
import com.etc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/selectLogin")
    public Admin selectLogin(@RequestBody Admin admin){
        try {
            Admin a = adminService.selectOne(admin.getAid());
            if(a!=null &&a.getApwd().equals(admin.getApwd())){
                return a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
