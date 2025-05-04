package org.example.section3.employee_managment;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private String dept;
    public Employee(int id,String name,int salary,String dept)
    {
        this.setId(id);
        this.setDept(dept);
        this.setSalary(salary);
        this.setName(name);
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return id+":"+name+":"+salary+":"+dept;
    }
}
