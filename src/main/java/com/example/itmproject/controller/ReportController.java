package com.example.itmproject.controller;

import com.example.itmproject.dto.ReportDto;
import com.example.itmproject.entities.Report;
//import com.example.itmproject.entities.Status;
import com.example.itmproject.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("save-report")
    public ResponseEntity<Report>addItem(@RequestBody ReportDto reportDto){
        return ResponseEntity.ok(reportService.save(reportDto));
    }

    /*@GetMapping("/report")
    public ResponseEntity<List<Report>>findAll(@RequestParam int year, int month){
        return ResponseEntity.ok(reportService.findAll(year, month));
    }

     */
}
