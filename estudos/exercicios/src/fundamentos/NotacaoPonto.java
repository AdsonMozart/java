package fundamentos;

public class NotacaoPonto {
	
	 public static void main(String[] args) {
		
		 String s = "Boa tarde X";
		 s = s.replace("X", "Senhora");
		 s = s.toUpperCase();
		 s = s.concat("!!!");
		 
		 System.out.println(s);
		 
		 System.out.println("Leo".toUpperCase());
		 
		 String y = "Bom dia X".replace("X", "Gui");
		 System.out.println(y);
	}
}
