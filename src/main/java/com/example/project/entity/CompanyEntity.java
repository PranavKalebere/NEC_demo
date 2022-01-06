package com.example.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class CompanyEntity
{
    @Id
    //@GeneratedValue
    private int companyId;
    private String companyName;
    private int netWorth;

    public CompanyEntity()
    {

    }

    public CompanyEntity(String companyName, int netWorth) {
        this.companyName = companyName;
        this.netWorth = netWorth;
    }

    public int getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public int getNetWorth()
    {
        return netWorth;
    }

    public void setNetWorth(int netWorth)
    {
        this.netWorth = netWorth;
    }

}
