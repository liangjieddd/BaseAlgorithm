package DynamicProgramming;

public class FrogJump {
	
	// 一次跳1个或者2个
		public static int easyJump(int num) {
			
			int sum = 0;
			if (num==0 || num == 1 || num == 2) {
				return num;
			}else {
				sum = easyJump(num-1)+easyJump(num-2);
			}
			
			
			return sum;
			
		}
		
		
		// 一次1个；一次2个；1次3个；... ； 1次n个
		// 思路，列出递推式，得出f(n) = 2~n-1f(1)
		
		public static int hardJump(int num) {
			
			int sum = 0;
			if (num ==1) {
				sum = 1;
			}else {
				sum = (int) Math.pow(2, num-1);
			}
			
			return sum;
			
		}
		
		public static void main(String[] args) {
			int input = 5;
			System.out.println("easy:"+easyJump(input));
			System.out.println("hard:"+hardJump(input));
			
		}

}
