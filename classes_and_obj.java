import java.util.*;

class Student{
    int YOB;
    String name;
    int check(){
        return YOB;
    }
}
public class classes_and_obj {
    public static void main(String[] args){
          Student s1=new Student();
         s1.name="Aman";
         s1.YOB=2003;
         System.out.println(s1.name);
         System.out.println(s1.check());
         Student s2=new Student();
         s2.name="Rahul";
         s2.YOB=2004;
         System.out.println(s2.name);
         System.out.println(s2.check());

    }
}
