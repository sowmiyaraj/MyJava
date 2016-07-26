package com.dallas.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.dialect.DerbyTenSevenDialect;

import com.dallas.hibernate.Address;
import com.dallas.hibernate.Employee;
import com.dallas.hibernate.JavaTrainer;
import com.dallas.hibernate.Student;
import com.dallas.hibernate.Trainer;

import java.util.ArrayList;
import java.util.Calendar;

import org.hibernate.*;
import java.util.*;
public class HibernateMainLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration configuration = new Configuration().configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
           Transaction transaction = session.beginTransaction();
          /* Student sObj = new Student();
           sObj.setName("SowMiya");
           //sObj.setAge(70);
           sObj.setSal(2367.3f);
           sObj.setGender('F');
           //session.save(sObj);
           
           Trainer tObj = new Trainer();
           tObj.setName("mohan");
           //tObj.setAge(80);
           //Trainer.age=99;
           //tObj.setSubject("Java");
           tObj.setSalary(2345);
           tObj.setBonus(100);
        
           List<String> subjectList = new ArrayList<>();
           subjectList.add("java"); 
           subjectList.add("csharp");
           subjectList.add("cplusplus");
           //tObj.setSubject(subjectList);
           //tObj.setJoiningdate(Calendar.getInstance().getTime());
           //session.save(tObj);
           
           List<String> qualList = new ArrayList<>();
           qualList.add("PhD"); 
           qualList.add("MTech");
           qualList.add("BE");
           //tObj.setQual(qualList);
           //tObj.setJoiningdate(Calendar.getInstance().getTime());
        
           */
           Address adObj = new Address();
           adObj.setHousenum(23);
           adObj.setStreet("6th main");
           adObj.setPincode(560038);
           
           Address adObj2 = new Address();
           adObj.setHousenum(77);
           adObj.setStreet("RMZ infinity");
           adObj.setPincode(560037);
                      
           Employee emp = new Employee();
           emp.setHomeAddress(adObj);
           emp.setOfficeAddress(adObj2);
           emp.setName("arvind");
           session.save(emp);
        /*  // tObj.setAddress(adObj);
           session.save(tObj);
                    
           JavaTrainer javaTrainer = new JavaTrainer();
           javaTrainer.setName("blore java trainer");
          // javaTrainer.setAddress(adObj);
          // javaTrainer.setQual(qualList);
          // javaTrainer.setSubject(subjectList);
           javaTrainer.setSalary(5000);
           javaTrainer.setBonus(50);
           session.save(javaTrainer);
           JavaTrainer javaTrainer2 = new JavaTrainer();
           session.save(javaTrainer2);
           
           Trainer trainer2 = new Trainer();
           session.save(trainer2);*/
           transaction.commit();
            session.close();
          
         /*  Session session2 = sessionFactory.openSession();
           Transaction transaction2 = session2.beginTransaction();
           // transaction2.begin();
           Trainer retrivedTrainer = session2.get(Trainer.class, "Ravi");
           System.out.println("retrieved trainer is "+ retrivedTrainer.getName() + "--"+ retrivedTrainer.getSalary());
           session2.close();*/
          sessionFactory.close();
           
	}

}
