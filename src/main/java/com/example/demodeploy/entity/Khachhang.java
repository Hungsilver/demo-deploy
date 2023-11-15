package com.example.demodeploy.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

//@Entity
//@Table(name = "khachhang")
@Data
@AllArgsConstructor
public class Khachhang {
//    @Id
//    @Column(name = "id")
    private Integer id;

//    @Column(name = "hoTen")
    private String hoTen;

//    @Column(name = "email")
    private String email;

//    @Column(name = "matKhau")
    private String matKhau;

//    @Column(name = "soDienThoai")
    private String soDienThoai;

//    @Column(name = "ngaySinh")
    private String ngaySinh;

//    @Column(name = "trangThai")
    private Integer trangThai;

}
