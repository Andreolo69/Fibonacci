import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Inserta numero: ");
        int num=sc.nextInt();
     int i;
int sum=1;
int a=1;
     for(i=1; i<num; i++) {   //i++=1, 2, 3, 4, 5, 6.....
                                    //a+i=sum //a+i=sum
     //1,1,2,3,5,8,13...1+1=2, 1+2=3, 2+3=5, 5+3=8, 5+8=13, 8+13=21;
         i=sum;

         sum=a+i;

         a=i;//

         System.out.print(sum+" ");


     }
    }
}
