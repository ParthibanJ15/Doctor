package com.appointmentsystem.appointmentsystem.controller;

import com.appointmentsystem.appointmentsystem.model.AdminDet;
import com.appointmentsystem.appointmentsystem.model.DoctorDet;
import com.appointmentsystem.appointmentsystem.model.UserDetails;
import com.appointmentsystem.appointmentsystem.repository.AdminRepo;
import com.appointmentsystem.appointmentsystem.repository.DoctorRepo;
import com.appointmentsystem.appointmentsystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private DoctorRepo doctorRepo;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/signup")
    public String Signup(){
        return "home";
    }
    @GetMapping("/signin")
    public String signin(){
        return "signin";
    }

    @GetMapping("/ap")
    public String ap(){
        return "ap";
    }
    @GetMapping("/app")
    public String app(){
        return "apponmemt1";
    }
    @GetMapping("/appoin1")
    public String appoin1(Model model){

        List<DoctorDet> ob=doctorRepo.findAll();
        model.addAttribute("doctor",ob);

        return "apponment1";
    }
    @Autowired
    private  UserRepo userRepo;

    @PostMapping("/sign")
    public String sign(@RequestParam("fname") String f,@RequestParam("lname") String l,@RequestParam("uname") String uname,@RequestParam("email") String email,@RequestParam("gender") String gender,@RequestParam("password") String p,@RequestParam("password2") String p2){
        UserDetails user=userRepo.findByEmail(email);
        UserDetails u=userRepo.findByUname(uname);
        if(p.equals(p2) && user==null && u==null ){
            UserDetails userDetails=new UserDetails(f,l,uname,email,gender,p);
            userRepo.save(userDetails);
            return "signin";
        }
        else{
            return "home";
        }

    }
    @PostMapping("/login")
    public String login(@RequestParam("email") String email,@RequestParam("password") String password,Model model)
    {
        UserDetails us=userRepo.findByEmail(email);
        UserDetails P=userRepo.findByPassword(password);
        if(us.email.equals(email) && P.password.equals(password))
        {
            model.addAttribute(email);
            return "index";
        }
        else{
            return "signin";

        }
    }
    @GetMapping("/doc")
    public String DoctorDetails()
    {
        return "DoctorDetails" ;
    }

@PostMapping("/docform")
public String docform(@RequestParam("docname") String dn,@RequestParam("specialization") String sp,@RequestParam("docfee") String docfee,@RequestParam("appfee") String appfee,@RequestParam("timming") String timming){
    DoctorDet doctorDet=new DoctorDet(dn,sp,docfee,appfee,timming);
    doctorRepo.save(doctorDet);
    return "index";

        }
    @Autowired
    private AdminRepo adminRepo;
    @GetMapping("/admlgn")
    public String admlgn(){
        return "admlgn";
    }
    @PostMapping("/admvfy")
    public String admvfy(@RequestParam("adminid") String adminid,@RequestParam("adminpass") String adminpass,Model model)
    {
        AdminDet ad=adminRepo.findByAdminid(adminid)  ;
        AdminDet adm=adminRepo.findByAdminpass(adminpass);
        if (ad.adminid.equals(adminid) && adm.adminpass.equals(adminpass)){
            model.addAttribute(adminid);
            return "ap";
        }
        else {
            return "admlgn";
        }
    }
     }

