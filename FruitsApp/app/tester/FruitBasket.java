package com.app.tester;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		{
		System.out.println("How Many Fruits You Add");
		int n=sc.nextInt();
		Fruit[] fruits=new Fruit[n];
		int choice;
		int count=0;
		do {
			System.out.println();
			System.out.println("options....");
			System.out.println("1.Add Mango:");
			System.out.println("2.Add Apple:");
			System.out.println("3.Add Orange");
			System.out.println("4.Display Name of all fruits in the Bascket");
			System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6.Invoke fruit specific functionality (pulp / juice / jam)");
			System.out.println("7.Mark all sour fruits stale ");
			System.out.println("8. Mark a fruit in a basket , as stale(=not fresh)");
			System.out.println("9.Exit");
			
			System.out.println("<<<<:Enter Options:>>>>");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("Add mango:");
				if(count<fruits.length)
				{
//				System.out.println("How many  Kg mango Add: ");
//				double weight=sc.nextInt();
//				fruits[count]=new Mango(sc.next(),sc.next(),weight);
					fruits[count]=new Mango();
				count++;
				}
				else
				{
					System.out.println("Bucket is full............");
				}
				break;
				
			case 2:
				System.out.println("Add Apple:");
				if(count<fruits.length)
				{
//					System.out.println("How many  Kg mango Add: ");
//					int weight=sc.nextInt();
					//fruits[count]=new Apple(sc.next(),sc.next(),weight);
					fruits[count]=new Apple();
					count++;
					}
					else
					{
						System.out.println("Bucket is full............");
					}
				break;
				
			case 3:
				System.out.println("Add Orange:");
				if(count>=0 && count<fruits.length)
				{
					//System.out.println("How many  Kg mango Add: ");
					//int weight=sc.nextInt();
					//fruits[count]=new Orange(sc.next(),sc.next(),weight);
					fruits[count]=new Orange();
					count++;
					}
					else
					{
						System.out.println("Bucket is full............");
					}
				break;
			case 4:
				System.out.println("We add this items in the Bscket");
				for(Fruit f:fruits)
				{
					if(f!=null)
					System.out.println(f.getName());
				}
				break;
			case 5:
				System.out.println("Display name,color,weight , taste of all fresh fruits , in the basket.");
				for(Fruit f:fruits)
				{
					if(f!=null)
					System.out.println(f +":"+ f.getTaste());
					
				}
				break;
			case 6:
				System.out.println("Enter Index number:to invoke specific Functionality");
				int index=sc.nextInt()-1;
				if(index>=0 && index<count)
				{
					System.out.println(fruits[index]);
				
				 if(fruits[index].getTaste()=="sweet")
				{
					for(Fruit f:fruits)
					{
						if(f instanceof Mango)
						{
							((Mango)f).pulp();
							break;
							
						}
					}
				}
				
				
				 if(fruits[index].getTaste()=="Sweet and sour")
				{
					for(Fruit f:fruits)
					{
						if(f instanceof Apple)
						{
							((Apple)f).jam();
							break;
						}
					}
				}
				if(fruits[index].getTaste()=="sour")
				{
					for(Fruit f:fruits)
					{
						if(f instanceof Orange)
						{
							((Orange)f).juice();
							break;
						}
					}
				}
				}
				else
				{
					System.out.println("Invalid Entry");
				
				}
				
				break;
			case 7://Mark all sour fruits stale 
				for(Fruit f:fruits)
				{
					if(f.getTaste()=="sour") 
					{
						
						System.out.println(f);
						
					}
				}
				
				break;
			case 8:
				System.out.println("Enter Index number to Fruits stale");
				index=sc.nextInt()-1;
				if(index<fruits.length)
				{
					fruits[index].setFresh(false);
					System.out.println("fruits stale done:");
				}
				else
				{
					System.out.println("pls Take correct index:");
				}
				
				break;
				
				default:
					System.out.println("bye");
				}
			
				
			
			
			
		}while(choice!=9);

	}
		sc.close();
	}

}
