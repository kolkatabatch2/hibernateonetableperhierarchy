import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



import account.Bank_Account;
import account.Billing_Details;
import account.Credit_Card;

public class Client{


	
	static void insertBank_Account(){
	SessionFactory sf=null;
	 Session session=null;
	  Transaction tr=null;

	  try{
	sf=util.HibernateUtil.getSessionFactory();
	session=sf.openSession();
	tr=session.beginTransaction();
	Billing_Details ba=new Bank_Account();
	ba.setOwner("Simson");
	Bank_Account ba1=(Bank_Account)ba;
	ba1.setAccount("A10001");
	ba1.setBank_name("HDFC");
	session.save(ba);
	tr.commit();
	 }
	 catch(Exception e){
		 System.out.println("Error with insert block");
		 tr.rollback();
		 session.close();
	 }
	}
	static void insertCredit_Card(){
		SessionFactory sf=null;
	  Session session=null;
	  Transaction tr=null;

	  try{
	sf=util.HibernateUtil.getSessionFactory();
	session=sf.openSession();
	tr=session.beginTransaction();
	Billing_Details ca=new Credit_Card();
	ca.setOwner("Henry");
	Credit_Card cc1=(Credit_Card)ca;
	cc1.setExp_Month("March");
	cc1.setExp_Year("2009");
	cc1.setNumber("S2001");
	session.save(ca);
	tr.commit();
	 }
	 catch(Exception e){
		 System.out.println("Error with insert block");
		 tr.rollback();
		 session.close();
	 }
	}
	static void list(){
	SessionFactory sf=null;
	Session session=null;
	sf=util.HibernateUtil.getSessionFactory();
	session=sf.openSession();
	List l1= session.createQuery("from Billing_Details").list();
	for( int i=0;i<l1.size();i++)
	{		
	Billing_Details o=(Billing_Details)l1.get(i);
	 System.out.println("Bank Details:  "+o.getId());
	if(o instanceof Bank_Account){
	 Bank_Account ba=(Bank_Account)o;
	 System.out.print(ba.getAccount()+"  "+ba.getBank_name());
	 System.out.println();
	 }
	 else
	 {
	 Credit_Card cc=(Credit_Card)o;
	 System.out.print(cc.getExp_Month()+"  "+cc.getExp_Year()+ "    "+cc.getNumber());
	 System.out.println();
	 }
	}
	}

public static void main(String a[]){
	insertBank_Account();
	insertCredit_Card();
	list();
}
}

