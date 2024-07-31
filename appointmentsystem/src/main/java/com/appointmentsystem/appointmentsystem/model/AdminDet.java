package com.appointmentsystem.appointmentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.security.PublicKey;

@Entity
public class AdminDet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String adminid;
    public String adminpass;
    public AdminDet(String adminid,String adminpass){
        this.id=id;
        this.adminid=adminid;
        this.adminpass=adminpass;
    }
    public AdminDet(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }
}
