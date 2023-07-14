
public class StringOperationExample {
	
	/*
	 * Mutable (수정가능한 데이터)
	 * Immutable (수정불가능한 데이터)
	 */

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		String str2= str.replace("자바", "JAVA");
		
		str.replace("자바", "JAVA");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str.substring(0));
		System.out.println(str.substring(3, 5));
		
		System.out.println( "  Hello  " );
		System.out.println( "  Hello  ".trim());

	}

}
