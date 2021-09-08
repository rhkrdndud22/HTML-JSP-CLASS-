package studylamda;

@FunctionalInterface // 함수형 인터페이스
//객체가 아닌 함수로 저장함

//이걸 선언하는 그 시점에 해당 함수를 구체화 함
public interface MyAddable {
	public int add(int x, int y);
}
