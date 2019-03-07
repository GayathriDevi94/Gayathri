package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernatedemo {
	
public static void main(String args[]){
	// TODO Auto-generated method stub
	Configuration config=new Configuration();
	config.configure("Hibernate.cfg.xml");
	SessionFactory sessionfactory=config.buildSessionFactory();
	Session session=sessionfactory.openSession();
	Transaction transaction=session.beginTransaction();
	com.Product product=new com.Product();
	product.setProductID(1001);
	product.setProductname("Moto");
product.setProductPrice(9000);
	session.save(product);
	transaction.commit();
	session.close();
	System.out.prinln("object saved");
}

}
