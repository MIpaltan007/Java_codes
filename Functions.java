import java.util.*;
public class Functions {
    static void tea(){
        System.out.println("Boil Water with tea leaves and sugar");
        System.out.println("Add Milk and Boil for 2 minutes");
        System.out.println("Serve The Milk tea");
    }
    static void coffee(){
        System.out.println("Boil Some Milk");
        System.out.println("Put Some Coffee in the cup");
        System.out.println("Pour the milk into cup");
    }
    public static void main(String[] args){
        tea();
        coffee();
        tea();
        tea();
        coffee();
    }
}
