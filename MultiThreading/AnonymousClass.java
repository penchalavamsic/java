//Multi threading using anonymous class
public class AnonymousClass{
    public static void main(String args[]){
       Thread t1=new Thread(){
            public void run(){ //anonaymous class
                for(int i=0;i<5;i++){
                    System.out.println(i+" "+Thread.currentThread().getName());
                }
            }
        };
       Thread t2= new Thread(){
        public void run(){
            for(int i=0;i<8;i++){
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }

       };
       t1.start();
       t2.start();//calling run()
    }
}
