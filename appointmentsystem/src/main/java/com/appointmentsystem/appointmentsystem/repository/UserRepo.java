package com.appointmentsystem.appointmentsystem.repository;

import com.appointmentsystem.appointmentsystem.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserDetails,Long> {
    UserDetails findByEmail(String email);
    UserDetails findByUname(String uname);
    UserDetails findByPassword(String p);
}
