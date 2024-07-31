package com.appointmentsystem.appointmentsystem.repository;

import com.appointmentsystem.appointmentsystem.model.AdminDet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<AdminDet,Long> {
    AdminDet findByAdminid(String adminid);
    AdminDet findByAdminpass(String adminpass);
}
