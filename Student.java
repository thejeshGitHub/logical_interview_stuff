import java.util.*;
import java.io.*; 
public class Student{	
		 
	private final String name;
	private final String city;
	
	
	public String getName(){
		return name;
	}	
	public String getCity(){
		return city;
	}	
	Student(String name, String city){
		this.name = name;
		this.city = city;
	}
	
	public void studentDisplay(){
		System.out.println("Student name :"+name+" and city is : "+city );
	}
}