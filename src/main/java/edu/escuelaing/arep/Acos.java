package edu.escuelaing.arep;

public class Acos {
	private static Double rta;
	
	/**
	 * calcula ACOS
	 * @param valor valor dado
	 * @return respuesta
	 */
	public static String calcularAcos(double valor) {
		rta= Math.acos(valor);	
		String json ="{\"operation\":"+"acos"+",\"input\":"+valor+",\"output\":"+rta+"}";

	    return json;
		

	}

	/**
	 * getRta retorna la respuesta
	 * @return rta la respuesta
	 */
	public static Double getRta() {
		return rta;
	}

	/**
	 * setRta remplaza la respuesta
	 * @param rta la respuesta
	 */
	public static void setRta(Double rta) {
		Acos.rta = rta;
	}
	
	public static void main( String[] args )
    {
	 System.out.println(calcularAcos(3.1415));
		
    }
}
