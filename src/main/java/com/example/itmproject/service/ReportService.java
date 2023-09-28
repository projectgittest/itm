package com.example.itmproject.service;

import com.example.itmproject.dto.ReportDto;
import com.example.itmproject.entities.Repair;
import com.example.itmproject.entities.Report;
//import com.example.itmproject.entities.Status;
import com.example.itmproject.entities.User;
import com.example.itmproject.repositories.RepairRepository;
import com.example.itmproject.repositories.ReportRepository;
import com.example.itmproject.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    private final UserRepository userRepository;
    private final RepairRepository repairRepository;
    private final ReportRepository reportRepository;

    public ReportService(UserRepository userRepository, RepairRepository repairRepository, ReportRepository reportRepository) {
        this.userRepository = userRepository;
        this.repairRepository = repairRepository;
        this.reportRepository = reportRepository;
    }


    public Report save(ReportDto reportDto) {

        if (reportDto != null && reportDto.getUser_id() != 0) {
            User userEntity = userRepository.findAllById(reportDto.getUser_id());

            if (reportDto.getRepair_id() != 0) {
                Repair repairEntity = repairRepository.findAllById(reportDto.getRepair_id());
                Report report = ReportDto.toEntity(reportDto, userEntity, repairEntity);

                return reportRepository.save(report);

            }
        }
        return null;
    }


    List<Report>reports=new ArrayList<>();

   /* public List<Report>findAll(int year,int month){
        reports=reportRepository.findAll(year, month);
        return reports;
    }

    */

}

