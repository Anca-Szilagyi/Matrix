package Laborator1;

import java.util.Scanner;

/* Sa se creeze doua metode astfel:
 a) citirea recursiva a unei matrice de m linii si n coloane;
 b) afisarea recursiva a unei matrici de m linii si n coloane.
 */



public class Problema26 {

	static void readElement (int i, int j, int matrix[][], int m, int n, Scanner scanner) {
		 if(i<m) {
			 matrix[i][j]=scanner.nextInt();
			 if(j<n-1) {
				 readElement(i, j+1, matrix, m, n, scanner);
			 }
			 else if(j==n-1) readElement(i+1, 0, matrix, m, n, scanner);
		 }
	}
	
	
	
	static void showMatrix (int i, int j, int matrix[][], int m, int n, Scanner scanner) {
		 if(i<m) {
			 System.out.print(matrix[i][j]+ " ");
			 if(j<n-1) {
				 showMatrix(i, j+1, matrix, m, n, scanner);
			 }
			 else if(j==n-1) { 
				 System.out.println(" ");
				 showMatrix(i+1, 0, matrix, m, n, scanner);
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
	  public static int afisMeniu() {
	    	System.out.println("\n1.introducere numar linii");
	    	System.out.println("2. introducere nr coloane");
	    	System.out.println("3. introducere elemente in matrice si afisare");

	    	//1
	    	
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
				  case 1: lens[0]=citLong("Introduceti numarul de randuri"); //citire primul numar
				          break;
				  case 2: lens[1]=citLong("Introduceti numarul de coloane");
				          break;
				  case 3://lens[0]=a;
				  //lens[1]=b;
					 
						int matrix[][] = new int[lens[0]][lens[1]];
						System.out.println("Introduceti "+lens[0]*lens[1]+" elemente.");
					  	readElement(0, 0, matrix, lens[0], lens[1], scanner);
					  	System.out.println("Matricea este...");
						showMatrix(0, 0, matrix, lens[0], lens[1], scanner);

					      break;
				  case 0: 
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
		
		
		
		
		
		
		
		/*Scanner scanner=new Scanner(System.in);
		 // read input from keyboard
		 int m=0,n=0;
		 System.out.print("Enter the number of rows in matrix: ");
		 m=scanner.nextInt();
		 System.out.print("Enter the number of columns in matrix: ");
		 n=scanner.nextInt();

 
		 int matrix[][] = new int[m][n];
		 
		 System.out.print("Enter the elements of the matrix: ");

		 
		readElement(0, 0, matrix, m, n, scanner);
	
		
		 System.out.print("Your matrix is: ");
		 System.out.println(" ");
		 
		 
		showMatrix(0, 0, matrix, m, n, scanner);
	}*/
}

