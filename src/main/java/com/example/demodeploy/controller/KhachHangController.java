package com.example.demodeploy.controller;

import com.example.demodeploy.entity.Khachhang;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class KhachHangController {
    private static final List<Khachhang> CUSTOMERS = List.of(
            new Khachhang(1, "john", "doe@gmail.com", "2345","02384525","12/2/2000",1),
            new Khachhang(2, "hung", "doe@gmail.com", "2345","02384525","12/2/2000",1),
            new Khachhang(3, "kduy", "doe@gmail.com", "2345","02384525","12/2/2000",1)
            );
    @GetMapping
    public List<Khachhang> findAllCustomers(){
        return CUSTOMERS;
    }
}
