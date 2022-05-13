package com.codegym.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

//implements interface Validator cua bo thu vien org.springframework.validation.Validator
//dto data transfer object
public class ProductDto implements Validator {

    private Integer id;
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z\\d]+$",message = "tên không được chứa ký tự đặt biệt")
    private String name;
    private Double price;
    @NotBlank
    private String describer;
    @NotBlank
    private String manufacture;

    public ProductDto() {
    }

    public ProductDto(Integer id, String name, Double price, String describer, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describer = describer;
        this.manufacture = manufacture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescriber() {
        return describer;
    }

    public void setDescriber(String describer) {
        this.describer = describer;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}