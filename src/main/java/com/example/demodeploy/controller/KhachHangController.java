package com.example.demodeploy.controller;

import com.example.demodeploy.entity.Khachhang;
import com.example.demodeploy.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/khachhang")
public class KhachHangController {

    @Autowired
    KhachHangRepository khachHangRepository;

    @GetMapping("")
    public ResponseEntity<?> findAllCustomers() {
        return ResponseEntity.ok(khachHangRepository.findAll());
    }

    @GetMapping("/hello")
    public ResponseEntity<?> hello(){
        return  ResponseEntity.ok("Hello!");
    }
}
