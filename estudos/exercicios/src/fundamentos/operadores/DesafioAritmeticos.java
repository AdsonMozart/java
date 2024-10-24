package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
		
		int elementoUm = 6 * (3 + 2);
		int potenciaUm = (int) Math.pow(elementoUm, 2) / (3 * 2);
		System.out.println(potenciaUm);
		
		int elementoDois = (1 - 5) * (2 - 7) / 2;
		int potenciaDois = (int) Math.pow(elementoDois, 2);
		System.out.println(potenciaDois);
		
		int resolvendoPotencias = (int) Math.pow((potenciaUm - potenciaDois), 3) / (int) Math.pow(10, 3);
		System.out.println(resolvendoPotencias);
		
	}
}
