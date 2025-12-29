public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minValue=i;
            //finding smallest element
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minValue]){
                    minValue=j;
                }
            }
            //swap samlest element
            int temp=arr[i];
            arr[i]=arr[minValue];
            arr[minValue]=temp;
        }
        
        
    }
    public static void main(String[] args) {
        int[] arr={20,5,6,8,22};
        selectionSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}
