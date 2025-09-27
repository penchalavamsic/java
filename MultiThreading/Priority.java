//get priority and set priority of thread
class PriorityClass extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
public class Priority{
    public static void main(String args[]){
        PriorityClass p1=new PriorityClass();
        PriorityClass p2=new PriorityClass();
        PriorityClass p3=new PriorityClass();
        PriorityClass p4=new PriorityClass();
        p1.setPriority(1);
        p2.setPriority(2);
        p3.setPriority(3);
        p4.setPriority(4);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}