
public class Pow {
	
	 public static double myPow(double x, int n) {
		 
		 if(x<=-100 || x>= 100)
			 System.out.println("wrong");
		
		 if(n==0)
			 x = 1;
		 
		 if(n>0) {
			 for(int i = 1;i<n;i++) {
				 x *= x;
			 }
			 
		 }
		 
		 if(n<0) {
			 for(int i=1;i<n;i++) {
				 x *= x;
			 }
			 x = 1/x;
		 }
		return x;
		 

	    }
	
	
	
	public static void main(String[] args) {
		double x = 2.0000;
		int n = 10;
		double result = myPow(x,n);
		System.out.println(result);
		
	}

}
