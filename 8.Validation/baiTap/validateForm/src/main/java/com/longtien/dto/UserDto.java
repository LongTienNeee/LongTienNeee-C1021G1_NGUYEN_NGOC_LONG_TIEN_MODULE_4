package com.longtien.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class UserDto {
    @NotNull(message = "Không được để trống")
    @NotBlank(message = "Không được nhập khoảng trắng")
    @Size(min = 5, max = 45, message = "Tên phải trên 5 kí tự và không quá 45 kí tự")
    private String firstName;

    @NotNull(message = "Không được để trống")
    @NotBlank(message = "Không được nhập khoảng trắng")
    @Size(min = 5, max = 45, message = "Họ phải trên 5 kí tự và không quá 45 kí tự")
    private String lastName;

    @NotNull(message = "Không được để trống")
    @Min(value = 18, message = "Bạn chưa đủ 18 tuổi")
    private Integer age;

    @NotNull(message = "Không được để trống")
    @Pattern(regexp="(0[9])+([0-9]{8,9})$" , message = "Phải bắt đầu bằng số  09 Và có 10 hoặc 11 kí tự")
    private String phoneNumber;

    @NotNull(message = "Không được để trống")
    @NotBlank(message = "Không được nhập khoảng trắng")
    @Email(message = "Sai định dạng Email")
    private String email;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, Integer age, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
