package com.example.demodeploy.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "khachhang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Khachhang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column(name = "hoTen")
    private String name;

    private Integer age;
}
