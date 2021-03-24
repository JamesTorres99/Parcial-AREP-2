package edu.escuelaing.arep;

public class Log {
	private static Double rs;
	
	/**
	 * calcula LOG base 10
	 * @param valor valor dado
	 * @return respuesta 
	 */
	public static String calcularLog(double valor) {
		rs= Math.log10(valor);	
		
		String json ="{\"operation\":"+"log"+",\"input\":"+valor+",\"output\":"+rs+"}";

	    return json;
		
		
	}

	/**
	 * getRta retorna la respuesta
	 * @return rta la respuesta
	 */
	public static Double getRs() {
		return rs;
	}

	/**
	 * getRta retorna la respuesta
	 * @return rta la respuesta
	 */
	public static void setRs(Double rs) {
		Log.rs = rs;
	}
	
	public static void main( String[] args )
    {
	 System.out.println(calcularLog(3.1415));
		
    }
    
}
