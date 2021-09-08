package testinterface;

public class Person implements Eatable {

	
	private String name;
	private String nNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getnNum() {
		return nNum;
	}

	public void setnNum(String nNum) {
		this.nNum = nNum;
	}

	public Person(String name, String nNum) {
		super();
		this.name = name;
		this.nNum = nNum;
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Eat(String Food) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"은"+Food+"를 먹습니다.");
	}
	@Override
	public void Test() {
		// TODO Auto-generated method stub
//		Eatable.super.Test();
		System.out.println("Test는 또 하나의 개발이다. 음식이 시큼한 맛이 나면 절대 먹지 마세요.");
		
	}
	
	
	
}
