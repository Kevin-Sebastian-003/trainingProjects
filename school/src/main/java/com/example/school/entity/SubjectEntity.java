package com.example.school.entity;


import javax.persistence.*;


/*
@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
@JoinColumn(name="subjectId")
private List<Subject> subjects;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="dept",referencedColumnName = "id")
private DepartmentEntity dept;
*/

@Entity
@Table(name="tbl_student")
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="age")
    private Integer age;

    @Column(name="dept")
    private String dept;

    @Column(name="year")
    private Integer year;

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Student [age=" + age + ", dept=" + dept + ", email=" + email + ", id=" + id + ", name=" + name
                + ", year=" + year + "]";
    }
}