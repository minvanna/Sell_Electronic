package com.shopping.example.Sell_Eletronic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.example.Sell_Eletronic.dto.DashboardDTO;
import com.shopping.example.Sell_Eletronic.repository.OrderRepository;
import com.shopping.example.Sell_Eletronic.repository.ProductRepository;
import com.shopping.example.Sell_Eletronic.repository.UserRepository;

@Service
public class DashboardService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private OrderRepository orderRepo;

    public DashboardDTO getDashboard() {
        DashboardDTO dto = new DashboardDTO();

        dto.setTotalUsers(userRepo.count());
        dto.setTotalProducts(productRepo.count());
        dto.setTotalOrders(orderRepo.count());


        Double revenue = orderRepo.getTotalRevenue();
        dto.setTotalRevenue(revenue != null ? revenue : 0.0);


        dto.setPendingOrders(orderRepo.countByStatus("PENDING"));
        dto.setCompletedOrders(orderRepo.countByStatus("COMPLETED"));

        return dto;
    }
}
