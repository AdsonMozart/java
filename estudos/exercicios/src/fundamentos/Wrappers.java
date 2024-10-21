package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;

//		Integer i = Integer.parseInt(entrada.nextLine); // Convertendo uma String para Int
		Integer i = 10000; //int
		Long l = 100000L;

		// Integer.parseInt
		System.out.println(b.byteValue()); // Pega o valor do tipo primitivo
		System.out.println(s.toString()); // Converte para string, ficando "1000"
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
//		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
	}
}
