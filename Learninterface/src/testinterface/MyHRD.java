package testinterface;

import java.util.ArrayList;

public class MyHRD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("이동준", "dfdf");
		Insect i = new Insect("똥파리");
		Machine m = new Machine("컴퓨터", 100);

		p.Eat();
		p.Eat("사과");

		i.Eat();
		i.Eat("사과");

		Eating(i, "빵");
		Eating(p, "빵");

		ArrayList<Eatable> list = new ArrayList<Eatable>();
		list.add(p);
		list.add(i);
		
		
		notify(list,"경북산업직업전문학교 별관 식당 밥");
		
		list.forEach(item -> item.Eat());
		
		//위의 코드를 원래대로 표현하자면 아래와 같았다.
		for(Eatable item : list)
			item.Eat();
	
	}
//	Eatable e
	static void notify(ArrayList<Eatable> list,String Food)
	{
		for(Eatable item : list) {
			item.Eat();
			item.Eat(Food);
		}
	}
	
	
	static void Eating(Eatable e, String Food) {
		e.Eat();
		e.Eat(Food);
		e.Test();
	}
}
