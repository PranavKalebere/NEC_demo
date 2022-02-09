package com.example.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class EmployeeEntity<S> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int empId;
    private int cmpId;
    private int salary;
    private Date createdDate;
    private String createdBy;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, int empId, int cmpId, int salary, Date createdDate, String createdBy) {
        this.name = name;
        this.empId = empId;
        this.cmpId = cmpId;
        this.salary = salary;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getCmpId() {
        return cmpId;
    }

    public void setCmpId(int cmpId) {
        this.cmpId = cmpId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
/*name
2. employeeId
3. companyId
4. salary
5. id (Primary key)
6. createdDate
7. created By*/