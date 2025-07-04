package Mantra;
//Write a Java program to rotate an array (length 3) of integers in the left direction.
//Sample Output:
public class RotateArray {
    public  static void rotate(int[]nums,int k){
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private static void reverse(int[]nums,int start,int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int a[]={2,3,4,5};
        rotate(a,3);

    }
}
