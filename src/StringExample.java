
public class StringExample {
	
	public static void main(String[] args) {
		int num = 10;
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		num = 200;
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str2);
		
		//참조타입에서의 값을 비교하려면 equals를 써야한다
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		
	}

}
