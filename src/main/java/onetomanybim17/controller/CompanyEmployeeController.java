package onetomanybim17.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybim17.dto.Company;
import onetomanybim17.dto.Employee;

public class CompanyEmployeeController {
public static void main(String[] args) {
	Company  company=new Company();
	company.setName("tyss");
	company.setGst("tyss@123");
	
	Employee employee1=new Employee();
	employee1.setAddress("bang");
	employee1.setName("poojitha");
	employee1.setCompany(company);
	
	Employee employee2=new Employee();
	employee2.setAddress("bang");
	employee2.setName("khowshik");
	employee2.setCompany(company);
	
	List<Employee> employees=new ArrayList<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	
	
	company.setEmployees(employees);
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(employee1);
	entityManager.persist(employee2);
	entityManager.persist(company);
	entityTransaction.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
