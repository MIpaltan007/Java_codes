public class Random_num_above_avg {
    public static void main(String[] args){
        int i,c=0,s=0;
        double avg;
        int mylist[]=new int[100];
        for(i=0;i<mylist.length;i++){
            mylist[i]=(int)(Math.random()*100);
            s+=mylist[i];
        }
        avg=s/mylist.length;
        for(i=0;i<mylist.length;i++){
            if(mylist[i]>avg){
                c++;
            }
        }
        System.out.println("Avg = "+avg);
        System.out.println("Above avg num = "+c);
    }
}
