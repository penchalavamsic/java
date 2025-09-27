//Printing prime number and fibonacci numbers using multithreading
public class Prime_Fibo{
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public synchronized  void run(){
                for(int i=1;i<=50;i++){
                    int count=0, j;
                    for(j=1;j<=i;j++){
                        if(i%j==0){
                            count++;
                        }
                    }
                    if(count==2){
                        System.out.println(i);
                    }
                }
            }
        };
    Thread t2=new Thread(){
        public synchronized void run(){
            int a=0 ,b=1;
            System.out.println(a);
            System.out.println(b);
            for(int i=0;i<50;i++){
                int c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
    };
    t1.start();
    t2.start();
    try{
    t1.join();
    t2.join();
    }
    catch(Exception e){
        System.out.println(e);
    
    }
    }
}


