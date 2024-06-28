import java.util.Scanner;
public class Calculator {
    
        void Addition(int x ,int y){
            
            int sum;
            sum = x + y;
            System.out.println("Addition of entered value :" + sum + "\n");
            
        }
        
        void Substraction(int x ,int y){
            
            int sub;
            sub = x - y;
            System.out.println("Substraction of entered value :" + sub+ "\n");
            
        }
        
        void Devide(int x ,int y){
            
            int dev;
            dev = x / y;
            System.out.println("Devition of entered value :" + dev+ "\n");
            
        }
        
        void Multiplication(int x ,int y){
            
            int mul;
            mul = x * y;
            System.out.println("Multiplication of entered value :" + mul+ "\n");
            
        }
    
    public static void main(String[] args){
        
        String  signnew;
        int  a,b;
        
        Calculator N1 = new Calculator();
        
        
        Scanner sign = new Scanner(System.in);
        
        System.out.println("-----------Welcome To Calculator-----------\n");
        
        System.out.println("Available cases :\n\n(1)add\n\n(2)sub\n\n(3)div\n\n(4)mul\n\n(5)exit\n");

        while (true){

        System.out.print("Enter your what do want :");
        signnew = sign.next();
        
        if(signnew.equalsIgnoreCase("exit")){
            break;
        }

        System.out.print("Enter the first Number :");
        a = sign.nextInt();
     
        System.out.print("Enter the first Number :");
        b = sign.nextInt();

        switch (signnew.toLowerCase()){
            
            case "add" :{
                
               N1.Addition(a, b);
               break;
            }
            
            case "sub" :{
                
                N1.Substraction(a, b);
                break;
            }
            
            case "div" :{
                
                N1.Devide(a, b);
                break;
            }
            
            case "mul" :{
                
                N1.Multiplication(a, b);
                break;
            }

        }


        }

        

        
    
            

    }

}
