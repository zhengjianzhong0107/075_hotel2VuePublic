package com.etc.model;

public class Admin {
    private String aid;
    private String aname;
    private String apwd;

    public Admin (){}

    public Admin(String aid, String aname, String apwd) {
        this.aid = aid;
        this.aname = aname;
        this.apwd = apwd;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }
}
