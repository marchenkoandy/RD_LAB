package com.company.lesson3;

import java.util.ArrayList;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/8/2019
 * #Comments:
 */
public class Company {
    private String CompanyName;
    private ArrayList<Person> employees;

    public Company(String companyName) {
        CompanyName = companyName;
    }

    public Company(String companyName, ArrayList<Person> employees) {
        CompanyName = companyName;
        this.employees = employees;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }
}
