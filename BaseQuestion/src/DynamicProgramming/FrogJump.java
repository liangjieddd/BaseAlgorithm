package DynamicProgramming;

public class FrogJump {
	
	// һ����1������2��
		public static int easyJump(int num) {
			
			int sum = 0;
			if (num==0 || num == 1 || num == 2) {
				return num;
			}else {
				sum = easyJump(num-1)+easyJump(num-2);
			}
			
			
			return sum;
			
		}
		
		
		// һ��1����һ��2����1��3����... �� 1��n��
		// ˼·���г�����ʽ���ó�f(n) = 2~n-1f(1)
		
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
