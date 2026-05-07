package com.shopping.example.Sell_Eletronic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DashboardDTO {
    private long totalUsers;
    private long totalProducts;
    private long totalOrders;
    private double totalRevenue;

    
    private long pendingOrders;
    private long completedOrders;
}
