package edu.escuelaing.arep;

import static spark.Spark.*;

import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class App 
{ 
	
	/**
	 * Inicializa el servidor web de spark, publica y recibe los mensajes
	 * @param args ejecucion
	 */
    public static void main( String[] args )
    {
    	Gson gson = new Gson();
        port(getPort());
        Client cliente=new Client();
        get("/hello", (req, res) -> { return "Hello :D";});
        
        get("/log", (req, res) -> { 
        	String value = req.queryParams("value");
        	double valor = Double.parseDouble(value);
        	String rta = "";
        	System.out.println(valor);
        	rta=Log.calcularLog(valor);
        	return  gson.toJson(rta);});
        
        get("/acos", (req, res) -> { 
        	String value = req.queryParams("value");
        	double valor = Double.parseDouble(value);
        	String rta = "";
        	System.out.println(valor);
        	rta=Acos.calcularAcos(valor);
        	return gson.toJson(rta);});
        }
        
        /**
         * retorna el puerto en uso
         * @return el puerto usado 
         */
        static int getPort() {
            if (System.getenv("PORT") != null) {
                return Integer.parseInt(System.getenv("PORT"));
            }
            return 5001;
        }

    }
