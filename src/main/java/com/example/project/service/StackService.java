package com.example.project.service;

import org.springframework.stereotype.Component;

@Component
public class StackService<i, a> {

    int max = 1000, top, i;
    int[] a = new int[max];

    public void insertdata(int num) {
        if (top >= (max - 1)) {
            System.out.println("Stack is full");
        } else {
            a[++top] = num;
            System.out.println(num + " pushed into stack");
        }
        for (i = 1; i <= top; i++)
        {
            System.out.println("Stack");
            System.out.println(a[i]);
        }
    }

}
