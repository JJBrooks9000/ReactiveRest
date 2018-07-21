package com.joshb.ReactiveRest.entity;

import java.io.Serializable;
import java.util.Formatter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
 
@Document(collection = "Users")
public class Users implements Serializable {
	static int total=10;
	public static void main(String[] args) {
		int total =5;
		StringBuilder sb = new StringBuilder("buffering");
		sb.replace(2, 7, "BUFFER");
		sb.delete(2, 4);
		String s = sb.substring(1, 5);
		System.out.println(s);
		
		boolean b=false;
		System.out.println((b=false) ? "1" : "2");
		
		//List<Integer> list =new ArrayList<int>();
		int y=127;
		switch(y) {
		default: System.out.print("129");
		case 127: System.out.println("127");
		case 128: System.out.println("128");
		}
		
		
		String strA="A";
		String strB="B";
		String strNull=null;
		StringBuilder strBuff = new StringBuilder("C");
		Formatter fmter = new Formatter(strBuff);
		
		fmter.format("%s%s", strA, strB);
		System.out.println("line1: "  +fmter);
		
		fmter.format("%-2s", strA);
		System.out.println("line2: "  +fmter);
		fmter.format("%b", strA, strB);
		System.out.println("line3: "  +strNull);
		
		Double d = 9.0;
		System.out.println(d++);
		
		
		Integer before = new Integer(25);
		Integer after = ++before == 26?5: new Integer(10);
		System.out.println(after.intValue()-before.intValue());
	
	}
	public void meth(String args[]) {
		
	}
	public static void main() {
		System.out.println("args2");
	}
	@Id
	int id;
	String name;
	String age;
	public Users() 
        {
	}
	public Users(String name, String age) {
		this.name = name;
		this.age = age;
	}
 
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
		
}
