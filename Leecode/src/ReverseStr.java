
public class ReverseStr {

	public static void reverse_1(int A) {
		// 此方法不适合做输出，如果要递归且输出，用reverse_2
		int n = A % 10;
		if (A >= 10) {
			reverse_1(A / 10);
		}

		System.out.println(n);

	}

	public static int reverse_2(int A) {
		long result = subReverse(0, A);

		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}

		return (int) result;
	}

	public static long subReverse(long r, long x) {
		if (x == 0) {
			return r;
		}

		return subReverse(r * 10 + x % 10, x / 10);

	}

	public static int pop(int number) {

		long result = 0;

		while (number != 0) {
			long pop = number % 10;
			number = number / 10;
			if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE)
				return 0;
			result = result * 10 + pop; // 这一步会导致溢出

		}

		return (int) result;

	}

	public static int pop_2(int number) {

		int result = 0;

		while (number != 0) {
			int pop = number % 10;
			number = number / 10;
			if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MIN_VALUE / 10) && pop > 7))
				return 0;
			if (result < (Integer.MIN_VALUE / 10) || (result == (Integer.MIN_VALUE / 10) && pop < -8))
				return 0;
			result = result * 10 + pop; // 这一步会导致溢出

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 1534236469;
		int output = pop_2(A);
		System.out.println(output);

	}

}
