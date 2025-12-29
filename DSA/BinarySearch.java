import java.util.*;
public class BinarySearch {
    public static int binarySearch(int target, int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return 1;
            }
            if(target>arr[mid]){
                low=mid+1;
            }
            if(target<arr[mid]){
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={22,5,6,8,78};
        //binary seacrh needs sorted array only
        Arrays.sort(arr);
        int target=5;
        int result=binarySearch(target, arr);
        if(result!=-1){
            System.out.println("Element found at position "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
