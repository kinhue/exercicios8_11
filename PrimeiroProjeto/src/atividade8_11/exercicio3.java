package atividade8_11;
import java.util.Scanner;


public class exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("Digite seu Sálario Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Qual seu adicional noturno? ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Quanto você ganhou de horas extras no mês? ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Quanto foi descontado do seu salário esse mês?: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + horasExtras - descontos);
		
		System.out.println("Seu salário liquído vai ser: "+salarioLiquido);
	
		
		
		
		
		
		
		

	}

}
