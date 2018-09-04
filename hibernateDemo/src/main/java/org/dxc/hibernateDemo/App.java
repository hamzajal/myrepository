package org.dxc.hibernateDemo;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Address addr=new Address();
        addr.setHno(20);
        addr.setStreet("chawni");
        addr.setCity("Indore");
        
        
        
        Employee emp=new Employee();
        emp.setId(21);
        emp.setName("abc");
        emp.setRollno("ec-21");
        emp.setAddr(addr);
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class);
        
        
        SessionFactory sFactory=cfg.buildSessionFactory();
        
        Session session=sFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(emp);
        tx.commit();
        
        
        
    }
}
