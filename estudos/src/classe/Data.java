package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
//		dia = 1;
//		mes = 2;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataCerta() {
		String formato = "%d/%d/%d";
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataCerta());
	}
}
