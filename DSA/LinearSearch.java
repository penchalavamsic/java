public class LinearSearch{
    public static int linearsearch(int target, int[] arr){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,5,6,88,10};
        int target=10;
        int result=linearsearch(target, arr);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position "+result);
        }
    
    }
}