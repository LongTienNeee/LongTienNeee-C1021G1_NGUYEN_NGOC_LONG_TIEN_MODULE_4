package com.longtien.customervalidation.dto;

import com.longtien.customervalidation.model.PhoneNumber;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PhoneNumberDto implements Validator{
    private String numberPhone;

    public PhoneNumberDto(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public PhoneNumberDto(){}

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneNumberDto phoneNumberDto = (PhoneNumberDto) target;
        String numberPhone = phoneNumberDto.getNumberPhone();
        ValidationUtils.rejectIfEmpty(errors, "numberPhone", "number.empty");
        if(numberPhone.length() > 11 || numberPhone.length()<10){
            errors.rejectValue("numberPhone" , "number.length");
        }
        if(!numberPhone.startsWith("0")){
            errors.rejectValue("numberPhone", "number.startsWith");
        }
        if (!numberPhone.matches("(^$|[0-9]*$)")){
            errors.rejectValue("number", "number.matches");
        }

    }
}
