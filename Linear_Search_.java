public class Linear_Search_ {
    public static int linearsearch(int[] list,int key){
        int result=-1,i;
        for(i=0;i<list.length;i++){
            if(key==list[i]){
                result=i;
            }
        }
        return result;

    }
    
}
