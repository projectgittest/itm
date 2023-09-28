package com.example.itmproject.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "report_id",unique=true, nullable = false)
    private Long report_id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user_id;
    
    @ManyToOne
    @JoinColumn(name = "repair_id",nullable = false)
    private Repair repair_id;

    @Column(name = "report_date")
    private Date report_date;


    public Long getReport_id() {
        return report_id;
    }

    public void setReport_id(Long report_id) {
        this.report_id = report_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Repair getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(Repair repair_id) {
        this.repair_id = repair_id;
    }

    public Date getReport_date() {
        return report_date;
    }

    public void setReport_date(Date report_date) {
        this.report_date = report_date;
    }
}
