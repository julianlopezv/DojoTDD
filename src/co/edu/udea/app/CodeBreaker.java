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
			else if(existeEnNumeroSecreto(numero % 10))
				respuesta += "_";
			objetivo /= 10;
			numero /= 10;
		}
		return respuesta;
	}
	
	private boolean existeEnNumeroSecreto(int digito){
		int objetivo = numeroSecreto;
		for(int i =0 ; i<4; i++){
			if(digito == objetivo % 10)
				return true;
			objetivo /= 10;
		}
		return false;
	}

}

