package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int empCheck = (int)Math.floor(Math.random()*10)%2;// 0 , 1
        if(empCheck == 1)
            System.out.println("Employee Present");
        else
            System.out.println("Employee Absent");

    }
}
