public class Var_args_demo {
    public static void main(String[] args){
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1,2,3});

    }
    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No Arguements Passed");
            return;
        }
        double result=numbers[0];
        int i;
        for(i=1;i<numbers.length;i++){
        if(numbers[i]>result)
        result=numbers[i];
        }
        System.out.println("The Max Value is "+result);
        
    }
}
