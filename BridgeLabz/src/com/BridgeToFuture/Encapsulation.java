package com.BridgeToFuture;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		int id = scanner.nextInt();
		scanner.nextLine();
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		scanner.nextLine();
		String grade = scanner.nextLine();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setGrade(age);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGrade());
		
	}

}
class Student{
	private int id;
	private String name;
	private int age;
	private int grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
