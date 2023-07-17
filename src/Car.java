
public class Car {
	
	int model;
	int speed;
	
	void forward() { //동작 ==> 메소드 (함수)
		int num; //로컬변수. 스택변수, 임시변수, 블력변수
		System.out.println("전진...");
	}
	void backward() {
		System.out.println("후진...");
	}

	public static void main(String[] args) {
		
		Car cL = new Car();
		cL.forward();
		cL.backward();
	}

}
