package com.santosh.integrationtest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "APPLICATION_USER")
public class ApplicationUser extends ModelBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;

    @Column(name = "name", length = 255)
    private String name;
}
