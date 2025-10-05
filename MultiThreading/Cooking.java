//Cooking food scenario with Multi Threading 
//using run() and start()
class CookingFood extends Thread{
        String task;
        public CookingFood(String task){
            this.task=task;
        }
        public void run(){ //internally called by start()
            System.out.println("Cooking "+task+"is done by"+Thread.currentThread().getName());
        }
}
public class Cooking{
    public static void main(String[] args) {
        CookingFood c1=new CookingFood("Biryani");
        CookingFood c2=new CookingFood("Noodles");
        c1.start(); //calling run()
        c2.start();
    }
}//