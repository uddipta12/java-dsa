import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        
        System.out.println("enter which multiplication table you want to print: ");
        int y=Sc.nextInt();

        for(int x=1;x<=10;x++){
            
            System.out.println(x + "x" + y + "=" + (x*y));
        }
    }
    
}
