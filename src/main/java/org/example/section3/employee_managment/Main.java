package org.example.section3.employee_managment;

public class Main {
    public static void main(String[] args) {
      EmployeeDetails empdetails=new EmployeeDetails();
      Employee emp=new Employee(101,"Rekha",35000,"Finance");
        Employee emp1=new Employee(102,"Swetha",25000,"Marketing");
        Employee emp2=new Employee(103,"Renu",55000,"Sales");
      empdetails.add(emp);
        empdetails.add(emp1);
        empdetails.add(emp2);
        empdetails.delete(emp1.getId());
        empdetails.search(emp.getId());
        empdetails.display();


    }
}
