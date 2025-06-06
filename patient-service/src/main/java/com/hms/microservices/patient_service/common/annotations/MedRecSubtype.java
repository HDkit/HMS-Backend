package com.hms.microservices.patient_service.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hms.microservices.patient_service.common.enums.MedRecType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MedRecSubtype {
    MedRecType value();
}
