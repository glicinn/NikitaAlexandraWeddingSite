package com.example.sashaandnikita.models;

import javax.persistence.*;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long request_id;

    @Column(name = "name_surname")
    private String name_surname;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "phone_code")
    private String phone_code;

    @Column(name = "request_status")
    private String request_status;

    @Column(name = "structure")
    private String structure;


    // Геттеры и сеттеры



    public Request(){}
    public Request(Long request_id, String name_surname, String phone_code, String phone_number, String request_status, String structure) {
        this.request_id = request_id;
        this.name_surname = name_surname;
        this.phone_code = phone_code;
        this.phone_number = phone_number;
        this.request_status = request_status;
        this.structure = structure;
    }

    public Long getRequestID() {
        return request_id;
    }

    public void setRequestID(Long request_id) {
        this.request_id = request_id;
    }


    public String getNameSurname() {
        return name_surname;
    }

    public void setNameSurname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getPhoneCode() {
        return phone_code;
    }

    public void setPhoneCode(String phone_code) {
        this.phone_code = phone_code;
    }


    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }


    public String getRequestStatus() {
        return request_status;
    }

    public void setRequestStatus(String request_status) {
        this.request_status = request_status;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }


}
