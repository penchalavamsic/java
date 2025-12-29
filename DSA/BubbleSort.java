public class BubbleSort {
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){ //n-1 passes
            for(int j=0;j<arr.length-i-1;j++){ //for avoiding last element
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={10,5,6,78,3};
        bubblesort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}
