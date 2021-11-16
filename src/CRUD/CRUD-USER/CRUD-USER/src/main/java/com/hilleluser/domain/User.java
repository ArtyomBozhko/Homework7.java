/*package com.hilleluser.domain;

import com.fasterxml.classmate.GenericType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.GenericArrayType;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String user_name;

    @NotBlank(message = "Email is mandatory")
    private String email;
}
*

 */