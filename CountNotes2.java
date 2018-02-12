package LoopingControlStatements;

import java.util.Scanner;

public class CountNotes2
{
    public static void main(String args[])
    {
        double amt;
		double r2000=0,r1000=0, r500=0, r200=0,r100=0, r50=0, r20=0, r10=0, r5=0, r1=0 ,c25=0,c50=0,count=0;
		int rs2000i=0,rs1000i=0, rs500i=0,rs200i=0, rs100i=0, rs50i=0, rs20i=0, rs10i=0, rs5i=0, rs1i=0, c50i=0, c25i=0;
		
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter The Amount: ");
        amt = sc.nextDouble();
 
    while(amt >= 2000) 
 { 
  r2000 = amt / 2000 ; 
  amt = amt % 2000;
  rs2000i=(int)r2000;
  System.out.print("\nTotal Number Of 2000 Rupees Notes :"+ rs2000i) ;
  break ; 
 }
    while(amt >= 1000) 
    { 
     r1000 = amt / 1000 ; 
     amt = amt % 1000;
     rs1000i=(int)r1000;
     System.out.print("\nTotal Number Of 1000 Rupees Notes : "+ rs1000i) ; 
     break ; 
    }
 while(amt >= 500) 
 { 
  r500 = amt / 500 ; 
  amt = amt % 500;
   rs500i=(int)r500;
  System.out.print("\nTotal Number Of 500 Rupees Notes : "+ rs500i) ;
  break ; 
 } 
 while(amt >= 100) 
 { 
  r100 = amt / 100 ; 
  amt = amt % 100;
   rs100i=(int)r100;
  System.out.print("\nTotal Number Of 100 Rupees Notes : "+ rs100i) ;
  break ; 
 } 
 while(amt >= 200) 
 { 
  r200 = amt / 200 ; 
  amt = amt % 200;
  rs200i=(int)r200;
  System.out.print("\nTotal Number Of 200 Rupees Notes : "+ rs200i) ;
  break ; 
 } 
 while(amt >= 50) 
 { 
  r50 = amt / 50 ;
  amt = amt % 50; 
  rs50i=(int)r50;
  System.out.print("\nTotal Number Of 50 Rupees Notes : "+ rs50i) ; 
  break ; 
 }  
 while(amt >= 20) 
 { 
  r20 = amt / 20 ; 
  amt = amt % 20;
  rs20i=(int)r20;
  System.out.print("\nTotal Number Of 20 Rupees Notes : "+ rs20i) ; 
  break ; 
 }  
 while(amt >= 10) 
 { 
  r10 = amt / 10 ; 
  amt = amt % 10;
  rs10i=(int)r10;
  System.out.print("\nTotal Number Of 10 Rupees Notes Or Coin : "+ rs10i) ; 
  break ; 
 } 
 while(amt >= 5) 
 { 
  r5 = amt / 5 ; 
  amt = amt % 5;
  rs5i=(int)r5;
  System.out.print("\nTotal Number Of 5 Rupees Notes Or Coin : "+ rs5i) ; 
  break ; 
 }  
 while(amt >= 1) 
 { 
  r1 = amt / 1 ; 
  amt = amt % 1;
  rs1i=(int)r1;
  System.out.print("\nTotal Number Of 1 Rupees Note Or Coin : "+ rs1i) ; 
  break ; 
 }
 while(amt>=0.50)
 {
	 c50=amt / 0.5;
	 amt=amt % 0.5;
	 c50i=(int)c50;
	 System.out.println("\nTotal Number Of 0.50 coin: "+c50i);
 }
 while(amt>=0.25)
 {
	 c25=amt / 0.25;
	 amt=amt % 0.25;
	 c25i=(int)c25;
	 System.out.println("\nTotal Number Of 0.25 coin: "+c25i);
 }
 count = rs2000i + rs1000i + rs500i + rs100i + rs200i + rs50i + rs20i + rs10i + rs5i + rs1i + c50i + c25i;  
 int count1=(int)count;
 System.out.print("\nTotal Number Of Notes Required :"+ count1) ; 
 }
}