import java.util.Scanner;
public class Sumfunc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num1=sc.nextInt();
        System.out.println("enter a number");
        int num2=sc.nextInt();
        int sum=add(num1,num2);
        System.out.println("the sum is "+ sum);
        sc.close();
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
        
}
