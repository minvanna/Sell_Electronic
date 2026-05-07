package com.shopping.example.Sell_Eletronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.shopping.example.Sell_Eletronic.dto.DashboardDTO;
import com.shopping.example.Sell_Eletronic.service.DashboardService;

@RestController
@RequestMapping("/api/admin")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService; 

    @GetMapping("/dashboard")
    public ResponseEntity<DashboardDTO> getDashboard() {
        return ResponseEntity.ok(dashboardService.getDashboard()); 
    }
}
