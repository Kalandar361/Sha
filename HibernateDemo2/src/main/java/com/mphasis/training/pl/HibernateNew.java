package com.mphasis.training.pl;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Persons;
import com.mphasis.training.entities.Product;
import com.mphasis.training.entities.Products;


public class HibernateNew {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Persons.class);
        StandardServiceRegistryBuilder builder=
                new StandardServiceRegistryBuilder().applySettings(con.getProperties());
    SessionFactory sessionFactory = con.buildSessionFactory(builder.build());
    
//    Persons p =new Persons();
//    p.setFname("kala");
//    p.setLname("jjkk");
//   
    

	}

}
