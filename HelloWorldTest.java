package java_Programs;

import java.time.LocalDate;
import java.util.Date;

public class HelloWorldTest {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	System.out.println("HELLOWORD");
		int number = 1_000;
		System.out.printf("%d\n", number);
		
		String name = new String("HelloWorldTest");
		System.out.println(name);
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfMonth());	
		
		Person alex = new Person("alex");
		Person dillon = alex;
		System.out.println(alex.name + " " + dillon.getClass());
		
		Date date = new Date();
		System.out.println("Date=" + date);
		
		int [] num = { 0, 1 ,2};

	}
}
/* Java Hello World */
/* */
class Person
{
	String name;
	Person(String name)
	{
		this.name = name;
	}	
}
