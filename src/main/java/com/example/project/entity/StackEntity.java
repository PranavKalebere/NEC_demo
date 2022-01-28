package com.example.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StackEntity
{
    @Id
    private int num;

    public StackEntity(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
