package tiposDeDatosYVariables;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola mundo");
		/*
		 * Tipos de datos
		 * 
		 * byte: sirve para representar un valor numero de 8 bits
		 * 
		 */
		byte salas = 10;
		System.out.println("Tenemos " + salas + " salas de cine");
		
		//Sirve para representar un valor numero de 16bits
		short asientos = 1120;
		System.out.println("Cada sala tiene: " + asientos + " asientos");
		
		//int: sirve para almacenar un valor numero de 32bits
		int dulces = 3476;
		System.out.println("Se vendieron: " + dulces + " dulces");
		
		//long: Sirve para representar un valor numero de 64 bits
		long clientes = 313600;
		System.out.println("Han habido: " + clientes + " clientes");
		
		//Datos que pueden tener punto decimal
		
		//float: Srive para almacenar un valor numerico de 32bits
		float palomitas = 35.5f;
		System.out.println("Se han consumido " + palomitas + "kg de palomitas");
		
//		double: Sirve para representar un valor numerico de 64bits
		double ganancia = 23770880.7d;
		System.out.println("Se ha tenido el dia de hoy la ganancia de $" + ganancia + " pesos");
		
		//Boolean sirve para valores booleanos true o false
		//char sirve para representar caracteres o un numero (solamente uno)
		
		//Casting o casteo sirve para realizar una conversión de tipos de datos a uno mas grande o mad pequeño
		double ice = 59.7f;
		//Casteo
		int iceInt = (int)ice;
		System.out.println("Se convirtió el valor float " + ice + " en entero " + iceInt);
		
		long numlong = (long)ice;
		System.out.println("Se convirtió el valor float " + ice + " en long " + iceInt);
		
		String cantidad = "85";
		String precio = "59.7";
		int cantEntero = Integer.parseInt(cantidad);
		double cantEnteroPrecio = Double.parseDouble(precio);
		System.out.println(cantEntero);
		System.out.println(cantEnteroPrecio);
		System.out.println("El valor de la compra es: $" + ("cantEntero*cantEnteroPrecio"));
		
		
		//Actividad Fer de Hoteles
		
		//HOTEL TRANSILVANIA
		
		boolean statusHabitacion = false;
		byte ocupantesXHabitacion = 5;
		short cantidadHabitaciones = 50;
		int numeroPisos = 10;
		long clientesAnuales = 100600;
		
		float precioXHabitacion = 1500.50f;
		double gananciaAnual = 5500000.7d;
		
		//Operadores aritmeticos
		
		int dias = 28;
		dias  = dias / 2;
		System.out.println("dias: " + dias);
		
		//Operadores de incremento y decremento
		int p = 0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
		/*Operadores relacionales
		 * 
		 * == compara si un operando es igual a otro
		 * !0 diferente a 
		 * < mayor que
		 * > menor que
		 * <= mayor o igual que
		 * >= menor o igual que
		 */
		
		int a = 10;
		int b = 15;
		boolean resultado;
		
		resultado = (a == b);
		System.out.println(resultado);
		
	}

}
