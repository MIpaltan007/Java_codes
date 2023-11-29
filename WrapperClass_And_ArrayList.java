import java.util.*;
public class WrapperClass_And_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner k=new Scanner(System.in);
        int i;
        System.out.println("Enter some non zero integers, Enter 0 to end ");
        int number=k.nextInt();
        while(number!=0){
            list.add(number);  //Autoboxing
            number=k.nextInt();
        }
        System.out.println("Your numbers in reverse are ");
        for(i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));  //Unboxing
        }
    }
}
