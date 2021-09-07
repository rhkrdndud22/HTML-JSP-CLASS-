package javatest.servlet.example;

public class animal {
	private String name;
	private int age;
	private int number;
	private String kind;
	
	public animal(String name, int age, int number,String kind) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.kind=kind;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
}
