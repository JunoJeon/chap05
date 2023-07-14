
public class ArrayExample {
	
	public static void main(String[] args) {
		int[][][] nums = new int[3][10][20];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				do {
					nums[0][i][j] = (int)(Math.random()*8+30);
					nums[1][i][j] = (int)(Math.random()*8+40);
					
				} while (nums[0][i][j] + 10 == nums[1][i][j]);
				
				nums[2][i][j] = (int)(Math.random()*26+'A');
			}
		}
		
		for(int k=0; k<3; k++) {
			for(int i=0; i<10; i++) {
				for(int j=0; j<20; j++) {
					if(k==2)
						System.out.printf("%c ", nums[k][i][j]);
					else
						System.out.printf("%d ", nums[k][i][j]);
				} 
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("\033[0m");
		
		for(int i=0; i<10; i++) {
			for (int j=0; j<20; j++) {
				System.out.printf("\033[%dm", nums[0][i][j]); //fg
				System.out.printf("\033[%dm", nums[1][i][j]); //bg
				System.out.printf("%c ", nums[2][i][j]);		//ch
			}
			System.out.println();
		}
		System.out.println("\033[0m"); // color reset
	}
	
	public static void main7(String[] args) {
		
		int[][][] nums = {
				{
					{1,2,3,4},
					{2,3},
					{1,1,1,2,2,2,2}
				},
				{
					{1,2,3,4},
					{2,3},
					{1,1,1,2,2,2,2},
					{1,1,1}
					
				}
		};
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				for (int k=0; k<nums[i][j].length; k++) {
					System.out.printf("%02d ", nums[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main6(String[] args) {
		int[][] nums = new int[3][4];
		
		for(int i=0; i<nums.length; i++) {
			for (int j=0; j<nums.length; j++)
				nums[i][j] = (int)(Math.random()*8+30);
		}
		
		for(int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				
			}		
		}
	}
	
	public static void main5(String[] args) {
		int[][] nums = {
				{1,2,3,4},
				{5,6,7,8,9},
				{9}		
		};
		
		System.out.println(nums.length);
		System.out.println(nums[0].length);
		System.out.println(nums[1].length);
		System.out.println(nums[2].length);
		
		int sum=0;
		for (int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++)
				sum += nums[i][j];
		}		
		System.out.println(sum);
	}

	
	
	public static void main4(String[] args) {
		int[] nums = new int[100];
		
		
		for (int i=0; i<nums.length; i++)
			nums[i] = (int)(Math.random()*100+1);
			
		for (int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		
		int sum = 0;
		for (int i=0; i<nums.length; i++)
			sum += nums[i];
		
		double avg = (double) sum/nums.length;
		
		System.out.printf("avg = %.2f\n " ,avg);
		
	}
	
	
	public static void main3(String[] args) {
		int[] nums = {1,56,7,9};
		
		int[] nums2;
		nums2 = new int[]{5,2,3,6};// nums 의 인티저배열변수를만들고 나중에 초기화를하려하면 그냥은 안되고 new int[]를 붙여야한다
		
		nums [0] = 100; //[]사이의 인덱스는 0부터 시작한다.
		nums [3] = 200;
//		nums [4] = 300; //결과값을 산출해낼 수 없을때 프로그램은 죽어버린다.
		
		System.out.println(nums[1]);
		System.out.println(nums[0]);
		System.out.println("End...");
	}

	public static void main2(String[] args) {
		int num = 10;
		
		int[] nums = {10, 20, 40};
		nums = null;
		
		String str = "java,c/c++,python,html,css";
		
		String[] strs = str.split(",");
		
		System.out.println(str);
		
		for (int i=0; i<strs.length; i++) 
			System.out.println(strs[i]);
			
		
	}

}
