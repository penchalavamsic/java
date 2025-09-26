//Using Runnable Interface
//Printing scores of players using multu threading
class Scores implements Runnable{
    private int score;
    public Scores(int score){
        this.score=score;
    }
    public void run(){
        System.out.println("Score of  "+Thread.currentThread().getName()+"is "+score);
    }
}
public class ScoresPrinting{
    public static void main(String args[]){
        Thread s=new Thread(new Scores(100));
        Thread s1=new Thread(new Scores(99)); //using runnable
        s.start();
        s1.start();

    }
}