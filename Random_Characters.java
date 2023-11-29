import java.util.*;
public class Random_Characters {
    public static void main(String[] args){
        char arr[]=new char[100];
        int i;
        for(i=0;i<arr.length;i++){
            arr[i]=(char)(Math.random()*100);
        }
        char map[]=new char[100];
        for(i=0;i<100;i++){
            map[i]=0;
        }
        for(i=0;i<map.length;i++){
            arr[map[i]]++;
        }
        


    }
}
