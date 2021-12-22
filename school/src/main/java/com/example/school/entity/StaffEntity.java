package com.example.school.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_staff")
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}