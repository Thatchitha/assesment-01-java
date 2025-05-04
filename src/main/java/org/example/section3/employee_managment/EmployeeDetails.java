package org.example.section3.employee_managment;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
    List<Employee> emp=new ArrayList<>();
    public void add(Employee e)
    {
        emp.add(e);

    }
    public void delete(int id)
    {
        emp.removeIf(e->e.getId()==id);

    }
    public void search(int id)
    {
        for(Employee e:emp)
        {
            if(e.getId()==id)
            {
                System.out.println("Searched employee:"+e);
            }
        }


    }
    public void display()
    {
        for(Employee e:emp)
        {
            System.out.println(e);
        }

    }
}
