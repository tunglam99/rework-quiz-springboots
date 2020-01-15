package com.codegym.reworkquiz.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "userTable")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String confirmPassword;

    private String oldPassword;

    private String firsName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String gender;

    private String avatar;

    private boolean enabled;
}
