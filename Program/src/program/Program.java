
package program;


public class Program {
    static int n1=1,n2=1,n3=0,n4;    
 static void printFibonacci(int count){    
    if(count>0){    
         n4 = n1 + n2; 
         n3= n4*n4;
         n1 = n2;    
         n2 = n4;    
         System.out.println(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    

    
    public static void main(String[] args) {
        int count=12;    
        System.out.println(" "+n1);  
        printFibonacci(count-2);  
    }
    
}
