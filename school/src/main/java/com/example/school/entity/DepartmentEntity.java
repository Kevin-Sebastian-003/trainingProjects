package com.example.school.entity;


import javax.persistence.*;

@Entity
@Table(name="tbl_department")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String desc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="hod",referencedColumnName = "id")
    private StaffEntity hodId;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StaffEntity getHodId() {
        return hodId;
    }

    public void setHodId(StaffEntity hodId) {
        this.hodId = hodId;
    }

    @Override
    public String toString() {
        return "DepartmentEntity [desc=" + desc + ", hodId=" + hodId + ", id=" + id + ", name=" + name + "]";
    }

    
}