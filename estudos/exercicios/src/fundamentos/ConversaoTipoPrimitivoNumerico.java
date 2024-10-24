package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita
		System.out.println(a);
		
		float b = (float) 1.1234567899999999999; // Conversão explícita, exemplificanod a perda de informação (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Conversão explícita, exemplificanod a perda de informação (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; // Conversão explícita
		System.out.println(f);
	}
}
