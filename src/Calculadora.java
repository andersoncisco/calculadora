
//versão 1.0.0 date:10/05/2016

public class Calculadora {
	
		   public  double mul(double nu1, double nu2){
			   return(nu1*nu2);
			   
			   
		   }
		
		   public  double soma(double nu1, double nu2){
			   return(nu1+nu2);
			   
		   }

		   public  double menos(double nu1, double nu2){
			   return(nu1-nu2);
			   
			   
		   }
		   
		   public  double dividi(double nu1, double nu2){
			   return(nu1/nu2);
			   
			   
		   }

		   public static void main(String[] args) {

          Calculadora cal = new Calculadora();
          System.out.println("soma"+ cal.soma(4.8, 5.9));
          System.out.println("menos"+ cal.menos(8.9, 4.7));
          System.out.println("multiplicação "+cal.mul(7.9, 5.9));
          System.out.println("divisao" +cal.dividi(5.9, 29.5));
		   
		   }}

