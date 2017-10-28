import java.util.*;
import java.io.*; 
public final class ImmutableCircle{	
		 
	private final int id; 	 
	private final String name;
	private final Student std; 
	
	
	public int getId(){
		return id;
	}	
	public String getName(){
		return name;
	}	
	ImmutableCircle(int id,String name,Student student){
		this.id = id;
		this.name = name;
		std = student;
	}
	
	public Student getStudent(){
		return new Student(std.getName(), std.getCity());
	}
}