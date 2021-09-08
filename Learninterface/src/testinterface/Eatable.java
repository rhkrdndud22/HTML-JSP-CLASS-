package testinterface;


//Eat 이라는 함수들을 구체적으로 구현하라는 명령,규약,규칙
//규칙은 여러개가 달릴 수 있음
public interface Eatable {
	void Eat();
	void Eat(String Food);
	default void Test()
	{
		System.out.println("1111");
	};
}
