package com.example.itmproject.repositories;

import com.example.itmproject.entities.Repair;
import com.example.itmproject.entities.Report;
//import com.example.itmproject.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long>{

   /* @Query("Select r from Report r  where r.repair_id.status_enum='repaired' and year (r.report_date)=?1 and month(r.report_date)=?2")
    List<Report>findAll(@Param("year")int year,@Param("month")int month);

    */


}

