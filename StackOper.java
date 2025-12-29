class Stacks{
    private int size;
    private int [] stack;
    private int top;
    public Stacks(int size){
        this.size=size;
        stack=new int [size];
        top=-1;

    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        stack[++top]=data;
        System.out.println(data+" pushed into stack");
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        System.out.println(stack[top--]+" popped from stack");
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        System.out.println("Top element is "+stack[top]);
    }
    void display(){
        if(isEmpty()){
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
    int count(){
        return  top+1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==size- 1;
    }
}
public class StackOper {
    public static void main(String[] args) {
        Stacks s=new Stacks(5);
        s.push(10);
        s.push(22);
        s.push(2);
        s.display();
        s.peek();
        s.pop();
    }
}
