package com.mphasis.training;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Product;
import com.mphsis.training.daos.ProductDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Product APP" );
       
        Scanner sc =new Scanner(System.in);
        ProductDao pdao=new ProductDao();
        do {
        System.out.println("2.inser product\n 3.update product4.delete product"
        		+ "5.retrieve product 6.retrieve by cost 1.getall");
        
        switch(sc.nextInt()) {
        
        case 1: System.out.println("List of products");
		
			pdao.retriveAll().forEach(p->System.out.println(p));
			break;
        case 2 :System.out.println("insert product");
        
        Product p1=new Product();
		System.out.println("enter product id");
		p1.setPid(sc.nextInt());
		System.out.println("enter product name");
		p1.setPname(sc.next());
		System.out.println("enter cost");
		p1.setCost(sc.nextDouble());
		System.out.println("enter qty");
		p1.setQty(sc.nextInt());
		
		
			pdao.insertProduct(p1);
	System.out.println("Employee added "+p1.getPid());
	
        break;
        case 3:System.out.println("Enter id to update");
		
			Product p = pdao.retriveProductById(sc.nextInt());
			System.out.println("enter cost to update");
			p.setCost(sc.nextDouble());
			pdao.updateProduct(p);
			System.out.println(p);
		
		break;
        case 4: System.out.println("enter id to delete");
		
        pdao.deleteProduct(sc.nextInt());
			System.out.println("product record deleted");
		
		break;
        case 5:System.out.println("retrive product by id");
        	System.out.println("enter pid");
		
			Product e=pdao.retriveProductById(sc.nextInt());
			System.out.println(e);
		
		break;
           
			default:System.out.println("invalid choice");
        
			
             
        
		
	      
        }
        } while (true);
        
        
    }
}
