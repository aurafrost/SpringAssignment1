package problem1;
import java.util.*;
import java.util.Map.Entry;
public class Student {
	private int id;
	private String name;
	private String address;
	private int age;
	public Student(int id, String name, String address, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public Student(int id) {
		this.id = id;
	}
	public Student(String name) {
		this.name = name;
	}
	/*
	public Student(String address) {
		this.address = address;
	}
	public Student(int age) {
		this.age = age;
	}
	*/
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
}