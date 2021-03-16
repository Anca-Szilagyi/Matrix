package problema10;
import java.util.Scanner;
import java.util.ArrayList;


public class UserInterface {

    public UserInterface(){}
    
    public static ArrayList<Sir> citireSiruri(String sir) {
    	//metoda de citire a unei liste intregi de siruri
    	//returneaza un array cu elemente de tip Sir
    	System.out.println(sir);
    	ArrayList<Sir> sirDeSiruri = new ArrayList<Sir>();
		String[] elemente = new String[100];
    	try { Scanner scn = new Scanner(System.in);
    		String sirElem = scn.nextLine();
    		
    		String[] arrOfR = sirElem.split(" ");

    		for(int i=0; i<arrOfR.length; i++) {
    			elemente = arrOfR[i].split(",");

    		//for(int k=0; k<numbers.length; k++) numbers[k] = 0;
    			int[] numbers = new int[elemente.length];
    		for(int j = 0; j<elemente.length; j++) {

    			//if (j==0) {for(int k=0; k<numbers.length; k++) numbers[k] = 0;}
    			

    		   numbers[j] = Integer.parseInt(elemente[j]);
    		

    		}    		
    		 Sir intregi=new Sir(numbers);
        	//intregi.setElemente(numbers);
     		sirDeSiruri.add(intregi);
    		}
    		return sirDeSiruri;
    	}
    	catch (Exception exp) {
			 System.out.println("Reincercati! Ceva nu a fost introdus corect!");
			 return citireSiruri(sir);
    	}
    }
    
    
    
    
    

	public static int readInteger(String sir) {	  
		//metoda de citire de la tastaura a unui int
		// returneaza un numar natural
		System.out.println(sir);
		try	{									
			  Scanner scn = new Scanner(System.in);
			  int a=scn.nextInt();
			  return a;
	
		}
		catch(Exception exp) {
			 System.out.println("Reincercati! Nu ati introdus un numar natural.");
			 return readInteger(sir);		//apel recursiv pt. orice eroare
		}
		
	}

	
	public static void afisareSiruri(String printable, ArrayList<Sir> sirurileFormate) {
		//afisarea sirurilor construite, impreuna cu suma elementelor si numarul maxim din sir
		//printable = informatia de printat
		//array list de elemente de tipul Sir - sirurile introduse
    	System.out.println(printable);
    	for (int i=0; i<sirurileFormate.size(); i++) {
    		
    		System.out.print("Sirul numarul "+(i+1)+": ");
    		int nrElem = sirurileFormate.get(i).getNrElem();
    		for (int k=0; k<nrElem; k++) 
    			System.out.print(sirurileFormate.get(i).getElemente()[k]+" ");
    			System.out.println(" ");
    			System.out.print("Suma elementelor: ");
    			System.out.print(sirurileFormate.get(i).sumaElementelor());
    			System.out.println(" ");
    			System.out.println("Nr maxim: "+sirurileFormate.get(i).nrMax());
    		
    		System.out.println(" ");
    	}
	}
	
	
	public static void stergereSir(String printable, ArrayList<Sir> sirurileFormate) {
		//stergerea unui sir dupa afisarea acestora (de preferat)
		int nr = readInteger(printable);
						//aici printable sa ceara introducerea unui nr intreg;
		sirurileFormate.remove(nr-1);
		System.out.println("Sirul a fost sters!");
	}
	
	public static void sirElemMax(String printable, ArrayList<Sir> sirurileFormate) {
		//formarea sirului de elemente maxime din fiecare sir
		//afisarea acestuia, impreuna cu suma elementelor
		System.out.println(printable);
		int suma=0;
		for (int i=0; i<sirurileFormate.size(); i++) {
			System.out.print(sirurileFormate.get(i).nrMax()+ " ");
			suma += sirurileFormate.get(i).nrMax();
		}
		System.out.println("Suma elementelor: " + suma);
	}
	

	public static int afisareMeniu() {
		//meniul de afisat
		System.out.println("--- Va rugam sa alegeti dintre optiunile de mai jos ---");
		System.out.println("1. Citire siruri;");
		System.out.println("2. Afisare siruri;");
		System.out.println("3. Stergere sir;");
		System.out.println("4. Afisarea sirului cu elementele maxime;");
		System.out.println("0. Operatiuni terminate;");
		System.out.println("  ");
    	return (int) readInteger("Ce optiune alegi:");

	}

	
	public void program() {
		//programul propriu zis, care apeleaza toate functiile de mai sus
		int opt = afisareMeniu();
		ArrayList<Sir> siruriFormate = new ArrayList<Sir>();
		int[] elemente = {};
		 Scanner scn = new Scanner(System.in);
		 int[][] matrix = new int[100][100];


		while(opt!=0) {
			switch(opt) {
			  case 1: siruriFormate=citireSiruri("Introduceti sirurile separate prin spatiu, cu elemente separate prin virgula: "); //citire primul numar
			          break;
			  case 2: 
				  afisareSiruri("Sirurile sunt: ", siruriFormate);
			          break;
			  case 3: stergereSir("Introduceti nr sirului pe care doriti sa il stergeti: ", siruriFormate);				 
			  		break;
				      
			  case 4: 
				  sirElemMax("Sirul cu elemente maxime: ", siruriFormate);
				  break;
			  case 0: System.out.println("Multumim!");
			  	break;
			  
			  default: System.out.println("Ai gresit optiunea, fii atent");
			}
			opt=afisareMeniu();
		}
		System.out.println("program terminat");

		
	}
}
