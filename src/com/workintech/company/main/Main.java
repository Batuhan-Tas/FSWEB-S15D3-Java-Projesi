package com.workintech.company.main;

import com.workintech.company.model.Employees;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employees> employees = new LinkedList<Employees>();
        employees.add(new Employees (1,"Batuhan","Taş"));
        employees.add(new Employees (1,"Batuhan","Taş"));
        employees.add(new Employees (2,"Ali","Veli"));
        employees.add(new Employees (2,"Ali","Veli"));
        employees.add(new Employees (2,"Ali","Veli"));
        employees.add(new Employees (3,"Ahmet","Mehmet"));


        Map<Integer,Employees> employeesMap = new HashMap<>();
        List<Employees> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while(iterator.hasNext()){
            Employees aEmployee = (Employees) iterator.next();
            if(employeesMap.containsKey(aEmployee.getId())){
                removedEmployees.add(aEmployee);
                iterator.remove();
            } else{
                employeesMap.put(aEmployee.getId(),aEmployee);
            }
        }
        System.out.println(employees);

    }


}