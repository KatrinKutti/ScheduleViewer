package com.example.demo.controller;

import com.example.demo.service.ReportService;
import com.example.demo.service.ScheduleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ReportController {
//test
    @Autowired
    private ReportService reportService;

    @CrossOrigin
    @GetMapping("getAllEmployeeScheduleDataWithNamesReport")
    public ScheduleResponse getAllEmployeeScheduleDataWithNamesReport(@RequestParam("dateFrom") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFrom,
                                                                      @RequestParam("dateTo") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateTo){
        return reportService.getAllEmployeeScheduleDataWithNamesReport(dateFrom, dateTo);
    }
}
