package com.exec.coll;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class AgeNotWithinRangeException extends Exception{

	{
		System.out.println("Age is not between 15 and 21 …");
	}
}

public class Student {
	
	private int rollno;
	private String name;
	private int age;
	private String course;
	
	public Student(int rollno,String name,int age,String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	
	public void display()
	{
		System.out.println("roll Name Age Course");
		System.out.println("————————————————-");
		System.out.println(rollno+name+age+course);
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Student student=new Student(1,"Sachin",25,"Computer science");
		
		BufferedReader bufferedReader=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll,name,age,course");
		int rollno=Integer.parseInt(bufferedReader.readLine());
		int age=Integer.parseInt(bufferedReader.readLine());        
        String name=bufferedReader.readLine();
        String course=bufferedReader.readLine();
        Student student=new Student(rollno,name,age,course);
		
		try
		{
			if(age <= 15 || age >= 21) {
				throw new AgeNotWithinRangeException();
			}
			else
			{
				System.out.println("Roll Number:" + rollno);
				System.out.println("name:" + name);
				System.out.println("age:" + age);
				System.out.println("course:" + course);
			}
			//if(name)
			{
				
			}
		}
		catch(AgeNotWithinRangeException exception)
        {
            System.out.println(exception);
        }

	}

}
