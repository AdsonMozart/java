package fundamentos;

public class TipoString {

		public static void main(String[] args) {
			System.out.println("Olá pessoal".charAt(2)); //Identificar o caracter do índice passado
			
			String s = "Boa tarde";
			System.out.println(s.concat("!!!")); // 1º forma de concatenar
			System.out.println(s + "!!!"); // 2º forma de concatenar
			System.out.println(s.startsWith("Boa")); //Para saber se o valor da string inicia com o valor passado no parâmetro
			System.out.println(s.toLowerCase().startsWith("boa")); //Primeiro converteu toda o valor da variável para lowercase e depois perguntou se inicia
			System.out.println(s.length()); //Conta o número de índices do valor da variável
			System.out.println(s.equals("boa tarde")); //Compara se o parâmetro é igual ao valor da variável passado
			System.out.println(s.equalsIgnoreCase("BOA TARDE"));
			
			var nome = "Adson";
			var sobrenome = "Mozart";
			var idade = 22;
			var salario = 12345.987;
			
			System.out.println("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
			System.out.printf("O senhor %s %s tem %d de idade e ganha R$%.2f de salario.", nome, sobrenome, idade, salario);
			String frase = String.format("\nO senhor %s %s tem %d anos de idade e ganha R$%.2f de salario.", nome, sobrenome, idade, salario);
			System.out.println(frase);
			
			System.out.println("Frase qualquer".contains("qual")); // Para saber se dentro da String tem o valor do parâmetro
			System.out.println("Frase qualquer".indexOf("qual")); // Me informa o índice que o trecho começa dentro da String
			System.out.println("Frase qualquer".substring(6)); // Ele considera uma substring dentro da string a partir do parâmetro de índice indicado
			System.out.println("Frase qualquer".substring(6, 8)); // Ele considera uma substring dentro da string a partir do parâmetro de índice até o parâmetro de índice indicado
		}
}
