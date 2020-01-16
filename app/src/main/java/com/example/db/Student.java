package com.example.db;

public class Student extends People
{
    private  int grade;

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }
}
