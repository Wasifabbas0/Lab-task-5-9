import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args); {
        
        int x,y,add,sub,mul,dvd; 
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter value of x: ");
        x = obj.nextInt();
        System.out.println("Enter value of y: ");
        y = obj.nextInt();
        
        add = x+y;
        sub = x-y;
        mul = x*y;
        dvd = x/y;
        
        System.out.println("Addition: "+add);
        System.out.println("Subtraction: "+sub);
        System.out.print("Multiplication: "+mul);
        System.out.println("Division: "+dvd);
        }
}