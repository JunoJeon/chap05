
public class NullExample {
	public static void main(String[] args) {
		
		int num = 100/0;
		
		System.out.println(num);
		
		System.out.println("Program end..");
	}

	public static void main2(String[] args) {
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = null;
//		int num = null; //(X) 
		
//		str3 = "World"; 
		
		double d = Double.NaN;
		
		System.out.println(d + 100);
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		
		System.out.println("Program End..");
	}

}
