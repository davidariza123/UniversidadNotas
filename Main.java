package General;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		 //Estudiantes
		
		Estudiante e1 = new Estudiante("Pepito Perez " , 1);
		Estudiante e2 = new Estudiante("Juana de Arco " , 2);
		
		//Notas
		
		Nota n1 = new Nota(e1, "Ingles", 0.0);
		
		Nota n2 = new Nota(e1, "Espa�ol", 0.0);

        Nota n3 = new Nota(e2, "Ingles", 0.0);
		
		Nota n4 = new Nota(e2, "Espa�ol", 0.0);
		
		//TryCatch
		   try {
			   
			   //Las notas se cambian dentro de cada if, la nota de juana de ingles es 6.0 por lo tanto dara error
			   //La nota de pepito en esoa�ol es -2.0 por lo tanto dara errror.
			   
			   System.out.println(" Ingrese La identificacion ");	
			   
			   int op = scan.nextInt();
			   switch(op) {
			   
			   case 1:
				   System.out.println(" 1.Ingles // 2.Espa�ol ");	
				   int ops1 = scan.nextInt();
				   //Ingles
				   if(ops1 == 1) {
					   
					   n1.Agregar(1.0);
					   
				   }
				   //Espa�ol
                    if(ops1 == 2) {
					   
                    	 n2.Agregar(-2.0);// Aqui errrormenor a 0
				   }
				   
				   
				   
				   
				   break;
				   
				   
			   case 2:
				   
				   System.out.println(" 1.Ingles // 2.Espa�ol ");	
				   int ops2 = scan.nextInt();
				   
				   //Ingles
				   if(ops2 == 1) {
					   
					   n3.Agregar(6.0); // Aqui error mayor a 5
					   
				   }
				   //Espa�ol
                    if(ops2 == 2) {
					   
                    	n4.Agregar(5.0);	
				   }
				   
			   
				   break;
			   
			   }
			   
			   
			   
	        }   catch (Error ex) {
	            System.out.println(" ");
	            
	            System.out.println(ex.getMessage());
 
	         } finally {
	        	  System.out.println("");
	            System.out.println("Gracias por consultar las notas");
	        }

	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


