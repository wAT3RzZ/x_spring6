package com.springmvc.mybatis.pojo;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 18:27 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class User {
    private Integer Id;

    private String Name;

    private Double Salary;


    @Override
    public String toString() {
        return "user{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}
