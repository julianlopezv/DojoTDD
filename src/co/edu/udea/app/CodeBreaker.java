package co.edu.udea.app;

public class CodeBreaker {
	private final int numeroSecreto = 4381;
	
	public String adivinar(int numeroIngresado){
		String respuesta="";
		int objetivo = numeroSecreto;
		int numero = numeroIngresado;
		
		for(int i =0 ; i<4; i++){
			if(numero % 10 == objetivo % 10)
				respuesta += "X";
			else
				respuesta += "_";
			objetivo /= 10;
			numero /= 10;
		}
		return respuesta;
	}

}

