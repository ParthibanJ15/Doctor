package com.appointmentsystem.appointmentsystem.repository;

import com.appointmentsystem.appointmentsystem.model.DoctorDet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<DoctorDet,Long> {
}
