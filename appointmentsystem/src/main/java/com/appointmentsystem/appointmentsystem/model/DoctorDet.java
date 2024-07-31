package com.appointmentsystem.appointmentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DoctorDet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String docname;
    public String specialization;
    public String docfee;
    public String appfee;
    public String timming;
    public DoctorDet(String docname, String specialization, String docfee, String appfee, String timming) {
        this.docname = docname;
        this.specialization = specialization;
        this.docfee = docfee;
        this.appfee = appfee;
        this.timming = timming;
    }

    public DoctorDet(){

    }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getdocname() {
            return docname;
        }

        public void setdocname(String docname) {
            this.docname= docname;
        }

        public String getspecialization() {
            return specialization;
        }

        public void setspecialization(String specialization) {
            this.specialization = specialization;
        }

        public String getdocfee() {
            return docfee;
        }

        public void setdocfee(String docfee) {
            this.docfee = docfee;
        }

        public String getappfee() {
            return appfee;
        }

        public void setappfee(String appfee) {
            this.appfee = appfee;
        }

        public String gettimming() {
            return timming;
        }

        public void settimming(String timming) {
            this.timming = timming;
    }}
