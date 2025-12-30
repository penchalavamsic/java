public class InsertionSort {
    public static void insertionsort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];//element to be placed
            int j=i-1;
            //moving elements at right which are greater than key
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key; //placing at right position
        }
    }
    public static void main(String[] args) {
        int [] arr={10,5,88,3,4};
        insertionsort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
