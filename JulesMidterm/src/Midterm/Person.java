package Midterm;

public class Person {
	
		 public  String name;
		  public  String address;
		  public  String phoneNumber;
		  public String email;
		  public Person( String name, String address, String phoneNumber, String email) {
			  this.name = name;
			  this.address = address;
			  this.phoneNumber = phoneNumber;
			  this.email = email; }
		  @Override
		  public String toString() {
		  return this.getClass().getName() + "\n" + name;
		  }  
		 
  public class Student extends Person {
			  public final int FRESHMAN = 1;
			  public final  int SOPHOMORE = 2;
			  public  final int JUNIOR = 3;
			  public  final int SENIOR = 4;
			  protected  int status;
			
    public Student(String name, String address, String phoneNumber, String email){
    	super(name, address,phoneNumber , email); 
    }
			
    @Override
	  public String toString() {
	  return this.getClass().getName() + "\n" + name;
	  }
 
    
			}	
  public class Employee extends Person {
	  protected String office;
	  protected int salary;
	  protected MyDate dateHired;
	  public Employee(String name, String address, String phoneNumber, String email){
	    	super(name, address,phoneNumber , email); }
	  
	   
	 public  class Faculty extends Employee {
		  Faculty( String name, String address, String phoneNumber, String email ){
			  Person.this.super(name, address,phoneNumber , email );
			   
			  }
		  
		  }
		  
		  protected String officeHours;
		  protected int rank;

		  @Override
		  public String toString() {
		    return "Faculty";
		  }
  
  

	 public class Staff extends Employee {
		  Staff( String name, String address, String phoneNumber, String email){
			  Person.this.super(name, address,phoneNumber , email );  
		  } 
		 protected String title;

		  @Override
		  public String toString() {
		    return "Staff's title is " + title;
		  }
		}	  

  }

}




