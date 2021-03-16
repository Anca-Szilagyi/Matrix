package Laborator1;

import java.util.Scanner;

/* 25.Sa se creeze 2 metode astfel:
 a) citirea cu o singura structura repetitiva a unei matrice de m linii si n coloane (linie dupa linie, incepand cu prima linie);
b) afisarea cu singura structura repetitiva a unei matrice de m linii si n coloane (linie dupa linie, incepand cu prima linie).
 */

public class Problema25 {
	
	static int[][] readMatrix (int[] len, int matrix[][], Scanner scanner) {
		 System.out.print("Enter the elements of the matrix: ");
		 int m = len[0];
		 int n = len[1];
		int i =0, j=0;
		while(i<len[0]) {
			
			 if(j<n-1) 
			 { matrix[i][j]=scanner.nextInt();
			 		   j++;
			 }
			 else if(j==len[1]-1) {
			 matrix[i][j]=scanner.nextInt();
	 		   j=0;
	 		   i++;
			 }
		}	
		return matrix;
	}
	
	static void showMatrix (int[] len, int matrix[][])
	{
		System.out.print("Your matrix is: ");
		 System.out.println(" ");
		int i=0, j=0;
	
		while(i<len[0]) {
			
			 if(j<len[1]-1) { System.out.print(matrix[i][j]+ " ");
			 		   j++;
			 }
			 else if(j==len[1]-1) { 
			 System.out.print(matrix[i][j]+ " ");
			 System.out.println(" ");

			 j=0;
	 		   i++;
			 }
			
		
		 }

	}
	
	public static int citLong(String sir) {	//metoda de citire de la tastaura a unui long
		System.out.print(sir);
		try	{									//try pt. prinderea unor erori
			  Scanner scn = new Scanner(System.in);
			  int intregL=scn.nextInt();
			  return intregL;
	
		}
		catch(Exception exp) {
			 System.out.println("ai gresit!!, da numar intreg");
			 return citLong(sir);		//apel recursiv pt. orice eroare
		}
		
	}

	
	static void printUI (int[] len, Scanner scanner) {
		System.out.print("Enter the number of rows in matrix: ");
		 len[0]=scanner.nextInt();
		 System.out.print("Enter the number of columns in matrix: ");
		 len[1]=scanner.nextInt();
		 
	}
	
    public static int afisMeniu() {
    	System.out.println("\n1.introducere numar linii");
    	System.out.println("2. introducere nr coloane");
    	System.out.println("3. introducere elemente in matrice si afisare");

    	//1
    	System.out.println("4. afisare matrice");
    	
    	System.out.println("0.terminare program");
    	return (int) citLong("Ce optiune alegi:");
    	
    }
		
	
	
	public static void main(String[] args)
	{
		 Scanner scanner=new Scanner(System.in);
		 // read input from keyboard
		 int m=0,n=0;
		 int j = 0;
		 
		 int[] lens = {0, 0 };

		 int i=0;
		 
		 int opt=afisMeniu();
			//int a=0;1
	
			//int b=0;
			//int matrix[][] = new int[lens[0]][lens[1]];
			while(opt!=0) {
				switch(opt) {
				  case 1: lens[0]=citLong("da un numar"); //citire primul numar
				          break;
				  case 2: lens[1]=citLong("mai da un numar");
				          break;
				  case 3://lens[0]=a;
				  //lens[1]=b;
					 
						int matrix[][] = new int[lens[0]][lens[1]];

					  	matrix=readMatrix(lens, matrix, scanner);
					  	showMatrix(lens, matrix);
					      break;
				  case 4: 
					  System.out.println("gataaaaa");
					  break;
				  default: System.out.println("Ai gresit optiunea, fii atent");
				}
				opt=afisMeniu();
			}
			System.out.println("program terminat");

		 
		 
		// printUI(lengths, scanner);

		// readMatrix(lengths, matrix, scanner);
		// 
		 
		 System.out.print("Done!!!");
	
	} 
}

