//Continuosly printing message using sleep and multithreading
class Continuos extends Thread{
    String msg;
    public  Continuos(String msg){
        this.msg=msg;
    }
    public void run(){
        while(true){
        System.out.println(msg);
         try{
        Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    
    }
        }
    }
   

}
public class ContinuosPrint{
    public static void main(String args[]){
        Continuos c1=new Continuos("Hello");
        Continuos c2=new Continuos("Hi");
        c1.start();
        c2.start();
    }
}