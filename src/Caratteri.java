import java.util.Scanner;
public class Caratteri {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Inserta cadena de caracter: ");
        String s=sc.nextLine();
        System.out.print("Inserta cadena de caracter: ");
        String s1=sc.nextLine();
        System.out.print("Inserta cadena de caracter: ");
        String s2=sc.nextLine();
        System.out.print("Inserta cadena de caracter: ");
        String s3=sc.nextLine();

        String arr[]={s, s1, s2, s3};
        int i=0;
        int j=1;
        int sum=1;

        for(i=0; i<arr.length; i++) {
           for (j = 1; j < arr.length; j++) {
if(arr[i].length()<arr[j].length()){
    arr[i]=arr[j];

}
           }
            System.out.println("El caracter mas largo es: "+arr[i]);
           break;
        }
}

}
