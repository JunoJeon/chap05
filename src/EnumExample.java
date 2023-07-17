import java.time.DayOfWeek;

public class EnumExample {
	
	enum Gender {
		Male, Female
	}
	enum Color {
		Black,
		Red,
		Green,
		Yellow,
		Blue,
		Magenta,
		Cyan,
		White
	}
	
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				Color fg = Color.values()[(int)(Math.random()*8)];
				Color bg = Color.values()[(int)(Math.random()*8)];
				
				System.out.printf("\033[%dm", fg.ordinal()+30);
				System.out.printf("\033[%dm", bg.ordinal()+40);
				
				char ch = (char)(Math.random()*26+ 'A');
				System.out.print(ch);
			}
			System.out.println("\033[0m");
		}
	}
	
	public static void main5(String[] args) {
		Color[] colors = Color.values();
		
		for (Color c : colors)
			System.out.printf("%d, %s\n", c.ordinal(), c.toString());
		
		DayOfWeek[] weeks = DayOfWeek.values();
		
		for (DayOfWeek w : weeks)
			System.out.printf("%d, %s\n",w.ordinal(), w.toString());
	}

	public static void main4(String[] args) {
		Color c1 = Color.Black;
		Color c2 = Color.Cyan;
		
		System.out.printf("[%d, %s]\n",c1.ordinal(),c1.toString());
		System.out.printf("[%d, %s]\n",c2.ordinal(),c2.toString());
	}
	
	
		public static void main2(String[] args) {
		Gender g = null;
//		g = 10; //(x)
//		g = "male" //(x)
		g = Gender.Male;
		g = Gender.Female;
		
		DayOfWeek week = null;
		
		week = DayOfWeek.FRIDAY;
		
	}

}
