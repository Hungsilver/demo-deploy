package com.example.demodeploy.repository;

import com.example.demodeploy.entity.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<Khachhang,Integer> {
}
