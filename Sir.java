package problema10;

public class Sir {

		   private int numarElemente; 					// coeficientii ec. aX+b=0;
		   private int[] elemente= {};
		   
		   public Sir (int[] elemente) {
			   //constructor cu un parametru
			   // elemente = un sir de numar intregi
			   this.elemente = elemente;
			   this.numarElemente = elemente.length;
		   }
		   
		   public Sir() {
			   //constructor implicit
			   this.numarElemente = 0;
		   }
		
		   public Sir(Sir sirulMagic) {
			   //constructor de copiere
			   //this.sir va lua valorile sirului sirulMagic
			   this.numarElemente=sirulMagic.getNrElem();
			   this.elemente = sirulMagic.getElemente();
		   }
		   
		   
	
		public void setNrElem(int a){   
			//va seta numarul de elemente al sirului
			//a - numar intreg
			   this.numarElemente=a;
		   }
	
		   public void setElemente(int[] elem) {
			   //va seta sirul de elemente
			   //elem - un sir de numere intregi
			   this.elemente = elem;
		   }
		   
		   
		   public int   getNrElem()	{      
			   //returneaza numarul de elemente din sirul Sir
			   //numar natural
			   return numarElemente;
		   }
		 
		   public int[] getElemente() {
			   //returneaza elementele din Sir
			   //un sir de numere intregi
			   return elemente;
		   }
		
		   public int sumaElementelor() {
			   //returneaza suma elementelor din sir
			   // numar intreg
			   int suma = 0;
			   for (int i=0; i<this.numarElemente; i++)
				   suma = suma+this.elemente[i];
			   return suma;
		   }
		   
		   public int nrMax() {
			   //returneaza valoarea maxima a sirului
			   //numar intreg
			   int max=0;
			   for (int i=0; i<this.numarElemente; i++)
				   if(this.elemente[i]>max) max=this.elemente[i];
			   return max;

			   }
		   public void adaugaElement(int a) {
			   //adauga un element in sir
			   this.numarElemente++;

			   this.elemente[numarElemente] = a;
		   }
		  

}
