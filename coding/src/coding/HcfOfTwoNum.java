package coding;

import java.util.Scanner;

public class HcfOfTwoNum {

	public static void main(String[] args) {
		
		      Scanner sc =new Scanner(System.in);
		     System.out.println("Enter num1 : ");
		      int num1=sc.nextInt();
		     // sc.nextLine();
		     System.out.println("Enter num2 : ");
		      int num2=sc.nextInt();
		     int n=1;
		      System.out.println("hcf of num1 and num2 is:");
		      if(num1!=num2){
		          while(n!=0){
		              n=num1%num2;
		              if(n!=0){
		                  num1=num2;
		                  num2=n;
		              }
		          }
		           System.out.println(num2);
		      }
		      else {
		           System.out.println("Wrong input");
		      }
		      
		      
		    }
		

	}


