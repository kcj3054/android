package com.example.db;


public class Teacher extends  People
{
    private String Subject;

    public Teacher(String name, String Subject)
    {
        this.name = name;
        this.Subject = Subject;
    }

    public String getName()
    {
        return name;
    }
    public String getSubject()
    {
        return Subject;
    }
}