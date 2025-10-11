import java.util.*;
public class User_Objects{
    public static class Student{
        String name;
        int rollno;
        int age;
        //constructor
        Student(String name, int rollno, int age){
            this.name=name;
            this.rollno=rollno;
            this.age=age;
        }
        //toString 
        @Override
        public String toString(){
            return this.name+" "+this.rollno+" "+this.age;
        }
    }
    public static void main(String[] args) {
     List<Student> st=new ArrayList<Student>();
     //user defined objects
     st.add(new Student("A",1,23));   
     st.add(new Student("B",2,24));   
     st.add(new Student("C",3,25));   
     System.out.println(st);
     Iterator itr=st.iterator();
     while(itr.hasNext()){
        Student s1=(Student)itr.next(); //creating a studnet object to print as collection
        //printing only required items
        System.out.println(s1.name+" "+s1.rollno);
     }
    }
}