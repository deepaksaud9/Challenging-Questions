package Challenge;

import java.util.Scanner;

public class DigitCounting {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("enter your phone number");
		
		String phoneNumber = input.nextLine();
		
		int number0=0;
		int number1=0;
		int number2=0;
		int number3=0;
		int number4=0;
		int number5=0;
		int number6=0;
		int number7=0;
		int number8=0;
		int number9=0;
		
		//for digit 0
		for(int i=0;i<phoneNumber.length();i++)
		{
			
			if(phoneNumber.charAt(i)=='0')
			{
				number0++;	
			}
			
		}
		
		if(number0==1 || number0==2 || number0==3 || number0==4 || number0==5 || number0==6 || number0==7 || number0==8 || number0==9)
		{
			System.out.println("there are " + number0 + " 0 on the phone number ");
		}else {
			System.out.println("there is no zero available");
		}
		
		
		//for digit 1
		for(int i=0;i<phoneNumber.length();i++)
		{
			
			if(phoneNumber.charAt(i)=='1')
			{
				number1++;	
			}
			
			}
		if(number1==1 || number1==2 || number1==3 || number1==4 || number1==5 || number1==6 || number1==7 || number1==8 || number1==9)
		{
			System.out.println("there are " + number1 + " one on the phone number ");
		}else {
			System.out.println("there is no one available");
		}
	
	//for digit 2
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='2')
				{
					number2++;	
				}
				
		}
			if(number1==1 || number1==2 || number1==3 || number1==4 || number1==5 || number1==6 || number1==7 || number1==8 || number1==9)
			{
				System.out.println("there are " + number2 + " two on the phone number ");
			}else {
				System.out.println("there is no two available");
			}
		
			
	//for digit 3
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='3')
				{
					number3++;	
				}
				
		}
			if(number3==1 || number3==2 || number3==3 || number3==4 || number3==5 || number3==6 || number3==7 || number3==8 || number3==9)
			{
				System.out.println("there are " + number3 + " three on the phone number ");
			}else {
				System.out.println("there is no three available");
			}
			
			//for digit 4
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='4')
				{
					number4++;	
				}
				
		}
			if(number4==1 || number4==2 || number4==3 || number4==4 || number4==5 || number4==6 || number4==7 || number4==8 || number4==9)
			{
				System.out.println("there are " + number4 + " four on the phone number ");
			}else {
				System.out.println("there is no four available");
			}
		
			//for digit 5
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='5')
				{
					number5++;	
				}
				
		}
			if(number5==1 || number5==2 || number5==3 || number5==4 || number5==5 || number5==6 || number5==7 || number5==8 || number5==9)
			{
				System.out.println("there are " + number5 + " five on the phone number ");
			}else {
				System.out.println("there is no five available");
			}
			
			//for digit 6
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='6')
				{
					number6++;	
				}
				
		}
			if(number6==1 || number6==2 || number6==3 || number6==4 || number6==5 || number6==6 || number6==7 || number6==8 || number6==9)
			{
				System.out.println("there are " + number6 + " six on the phone number ");
			}else {
				System.out.println("there is no six available");
			}
			
			//for digit 7
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='7')
				{
					number7++;	
				}
				
		}
			if(number7==1 || number7==2 || number7==3 || number7==4 || number7==5 || number7==6 || number7==7 || number7==8 || number7==9 )
			{
				System.out.println("there are " + number7 + " seven on the phone number ");
			}else {
				System.out.println("there is no seven available");
			}
			
			//for digit 8
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='8')
				{
					number8++;	
				}
				
		}
			if(number8==1 || number8==2 || number8==3 || number8==4 || number8==5 || number8==6 || number8==7 || number8==8 || number8==9)
			{
				System.out.println("there are " + number8 + " eight on the phone number ");
			}else {
				System.out.println("there is no eight available");
			}
			
			//for digit 9
			for(int i=0;i<phoneNumber.length();i++)
			{
				
				if(phoneNumber.charAt(i)=='9')
				{
					number9++;	
				}
				
		}
			if(number9==1 || number9==2 || number9==3 || number9==4 || number9==5 || number9==6 || number9==7 || number9==8 || number9==9)
			{
				System.out.println("there are " + number9 + " nine on the phone number ");
			}else {
				System.out.println("there is no nine available");
			}
	}
}
