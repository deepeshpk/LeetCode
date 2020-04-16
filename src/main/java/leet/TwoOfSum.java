package leet;
class TwoOfSum
{
	public static int[] twoSum(int[] arr, int target) {
        int b[] = new int[2];
         for(int i=0; i< arr.length; i++){
        	for (int j= i+1; j<arr.length; j++ ){
        		if(arr[i] + arr[j] == target){
                    b[0] = i;
                    b[1] = j;
    				break;
    			}
        	}
        }
        return b;
    }
    
    public static void main(String args[]) {
        int arr[] = { 2,7,5, 9, 11,15 };
		int target = 17;
        int result[] = twoSum(arr,target);
        System.out.println("["+ result[0] + " " + result[1] + "]");
    }
}