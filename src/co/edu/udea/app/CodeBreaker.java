package co.edu.udea.app;

public class CodeBreaker {
	public String adivinar(int numeroAdivinar){
		String respuesta="";
		int objetivo= 4381;
		int ultDigito = numeroAdivinar % 10;
		int target = 4381 % 10;
		if(objetivo==numeroAdivinar){
			respuesta= "XXXX";
		}
		
		else if(ultDigito==target){
			respuesta="X";
		}
		return respuesta;
	}

}

