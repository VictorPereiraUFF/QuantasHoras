package programa;

import java.util.Scanner;

import dados.Horario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro horário:");
			System.out.print("Horas: ");
			int hora1 = sc.nextInt();
			System.out.print("Minutos: ");
			int minuto1 = sc.nextInt();
			System.out.print("Segundos: ");
			int segundo1 = sc.nextInt();
			System.out.println("Digite o segundo horário:");
			System.out.print("Horas: ");
			int hora2 = sc.nextInt();
			System.out.print("Minutos: ");
			int minuto2 = sc.nextInt();
			System.out.print("Segundos: ");
			int segundo2 = sc.nextInt();
			
			System.out.printf("Horário 1: ", hora1 + ":" + minuto1 + ":" + segundo1);
			System.out.printf("Horário 2: ", hora2 + ":" + minuto2 + ":" + segundo2);			
			
			int horaTotal = hora1 + hora2;
			int minutoTotal = minuto1 + minuto2;
			int segundoTotal = segundo1 + segundo2;
			
			Horario total = new Horario(horaTotal, minutoTotal, segundoTotal);
			total.horarioTotal();
			System.out.println("A soma dos 2 horários é de " + total);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
