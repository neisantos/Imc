import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe seu peso :" );
		Double peso = 				
		Double.parseDouble(sc.nextLine());
		System.out.println("Informe sua altura :");
		Double altura =
		Double.parseDouble(sc.nextLine());
		
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);
			if (imc < 16) {
				System.out.println("Sua classificacao: Magreza GRAVE !");
			}else if ((imc >=16) && (imc < 17)) {
				System.out.println("Sua classificacao: Magreza moderada!");
				}
			else if ((imc >=17) && (imc < 18.5)) {
				System.out.println("Sua classificacao:  Magreza Leve !");
				}
			else if ((imc >=18.5) && (imc < 25)) {
				System.out.println("Sua classificacao: Saudável");
				}
			else if ((imc >= 25) && (imc < 30)) {
				System.out.println("Sua classificacao: Sobrepeso");
				}
			else if ((imc >= 30) && (imc < 35)) {
				System.out.println("Sua classificacao: Obesidade Grau I");
				}
			else if ((imc >= 35) && (imc < 40)) {
				System.out.println("Sua classificacao: Obesidade Grau II");
				}
			else {
				System.out.println("Sua classificacao: Obesidade Grau III (Mórbida");
				}
				System.out.println("\n");
				
					sc.close ();
		

	}

}