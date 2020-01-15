package com.codegym.reworkquiz.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "userTable")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private
}
