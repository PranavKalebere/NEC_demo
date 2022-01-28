package com.example.project.service;

import org.springframework.stereotype.Component;

@Component
public class StackService
{
    int max=1000,top;
    int[] a = new int[max];
    public void insertdata(int num)
    {
        if (top>=(max-1))
        {
            System.out.println("Stack is full");
        }
        else
        {
            //int x;
            a[++top]=num;
            System.out.println(num + " pushed into stack");
        }
        for(int i = 0; i <= top; i++)
        {
            System.out.println(a[i]);
        }
    }
}
