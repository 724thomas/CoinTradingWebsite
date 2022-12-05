package com.example.cointradingwebsite.dto;

public class MemberDTO {

    private String email;
    private String password;
    private String name;
    private String phone;
    private String address;
    private String detail;
    private String ddatetime;

    public MemberDTO(String email, String password, String name, String phone, String address, String detail, String ddatetime) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.detail = detail;
        this.ddatetime = ddatetime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDdatetime() {
        return ddatetime;
    }

    public void setDdatetime(String ddatetime) {
        this.ddatetime = ddatetime;
    }
}
