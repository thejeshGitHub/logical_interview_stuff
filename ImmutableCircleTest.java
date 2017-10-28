import java.util.*;
import java.io.*; 
public class ImmutableCircleTest{	
		public static void main(String[] args){
			System.out.println("From ImmutableCircleTest");
			Student st = new Student("TEST", "Hyderabad");
			ImmutableCircle immutable =  new ImmutableCircle(101,"red_circle",st);			
			System.out.println("Circle Name : "+immutable.getName()+" and StudentName and city are: "+immutable.getStudent().getName()+" , "+immutable.getStudent().getCity());			
		} 
}