package com.example.itmproject.dto;

import com.example.itmproject.entities.Repair;
import com.example.itmproject.entities.Report;
import com.example.itmproject.entities.User;

import java.util.Date;

public class ReportDto {

    private  Long user_id;

    private Long repair_id;

    private Date report_date;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(Long repair_id) {
        this.repair_id = repair_id;
    }

    public Date getReport_date() {
        return report_date;
    }

    public void setReport_date(Date report_date) {
        this.report_date = report_date;
    }

    public static ReportDto toDto(Report report){
        ReportDto dto=new ReportDto();
        dto.setUser_id(report.getUser_id().getUser_id());
        dto.setRepair_id(report.getRepair_id().getRepair_id());
        dto.setReport_date(report.getReport_date());

        return dto;
    }


    public static Report toEntity(ReportDto reportDto, User user_id, Repair repair_id){
        Report entity=new Report();
        entity.setUser_id(user_id);
        entity.setRepair_id(repair_id);
        entity.setReport_date(reportDto.getReport_date());

        return entity;
    }
}
