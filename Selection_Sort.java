import java.util.*;
public class Selection_Sort {
    public static void main(String[] args){
                
        double currentmin=list[i];
        int currentminindex=i;
        for(int j=i;j<list.length;j++){
            if(currentmin>list[j]){
                currentmin=list[j];
                currentminindex=j;
            }
        }
        if(currentminindex !=i){
            list[currentminindex]=list[i];
            list[i]=currentmin;
        }

    }
}
