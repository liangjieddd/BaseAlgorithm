package BaseOperation;

public class ExceptSelf {
	 public int[] productExceptSelf(int[] nums) {
	        int[] results = new int[nums.length];
	        for(int i = 0; i < nums.length; i++){
	            results[i] = getLeft(nums,i-1) * getRight(nums,i+1);
	        }
	        return results;
	    }

	    public int getLeft(int[] nums, int right){
	        int resultLeft = 1;
	        if(right<0){
	            return 1;  
	        }else{
	            for(int i = 0; i <= right; i++){
	                resultLeft = resultLeft * nums[i];
	            }        
	        }
	        return resultLeft;
	    }

	    public int getRight(int[] nums, int left){
	        int resultRight = 1;
	        if(left >= nums.length){
	            return 1;
	        }else{
	            for(int i = left; i < nums.length; i++){
	                resultRight = resultRight * nums[i];
	            }
	        }
	        return resultRight;
	    }
	
	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,4};
		ExceptSelf exceptSelf = new ExceptSelf();
		int[] output = new int[4];
		output = exceptSelf.productExceptSelf(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println(output[i]);
			
		}
		
		
	}

}
