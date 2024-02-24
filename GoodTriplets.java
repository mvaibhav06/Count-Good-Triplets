public class GoodTriplets {
    public static int countTriplets(int[] nums, int a, int b, int c){
        int counter = 0;
        for (int i=0; i<nums.length-2; i++){
            for (int j=i+1; j<nums.length-1; j++){
                for (int k=j+1; k<nums.length; k++){
                    if ((Math.abs(nums[i]-nums[j])<=a) && (Math.abs(nums[j]-nums[k])<=b) && (Math.abs(nums[i]-nums[k])<=c)){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {

    }
}
