package com.user.entity;

import com.user.validations.ContactNumberConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {

    @Override
    public void initialize(ContactNumberConstraint contactNumber) {
    }

    @Override
    public boolean isValid(String contactNo, ConstraintValidatorContext cxt) {
            return contactNo != null && contactNo.matches("[0-9]+")  && (contactNo.length() > 8) && (contactNo.length() < 14);

        }

}