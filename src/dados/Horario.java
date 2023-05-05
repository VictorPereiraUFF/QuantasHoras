package dados;

public class Horario {
	
	private int segundos1, minutos1, horas1, segundos2, minutos2, horas2, segundosTotais, minutosTotais, horasTotais;

	public Horario(int segundos, int minutos, int horas) {
		super();
		this.segundos1 = segundos1;
		this.minutos1 = minutos1;
		this.horas1 = horas1;
		this.segundos2 = segundos2;
		this.minutos2 = minutos2;
		this.horas2 = horas2;
	}

	public int getSegundos1() {
		return segundos1;
	}

	public void setSegundos1(int segundos1) {
		this.segundos1 = segundos1;
	}

	public int getMinutos1() {
		return minutos1;
	}

	public void setMinutos1(int minutos1) {
		this.minutos1 = minutos1;
	}

	public int getHoras1() {
		return horas1;
	}

	public void setHoras1(int horas1) {
		this.horas1 = horas1;
	}
	
	public int getSegundos2() {
		return segundos2;
	}

	public void setSegundos2(int segundos2) {
		this.segundos2 = segundos2;
	}

	public int getMinutos2() {
		return minutos2;
	}

	public void setMinutos2(int minutos2) {
		this.minutos2 = minutos2;
	}

	public int getHoras2() {
		return horas2;
	}

	public void setHoras2(int horas2) {
		this.horas2 = horas2;
	}
	
	public void horarioTotal() {
		if ((horas2 < horas1) || (horas1 == horas2 && minutos2 < minutos1) || (horas1 ==horas2 && minutos1 == minutos2 && segundos2 < segundos1))  {
			throw new IllegalArgumentException("Erro: a quantidade de horas é irregular");
		}
		else if (horas1 > 24 || horas2 > 24 || minutos1 > 60 || minutos2 > 60 || segundos1 > 60 || segundos2 > 60) {
			throw new IllegalArgumentException("Erro: os dados informados são irregulares");
		}
		else {
			if (segundos1 + segundos2 >= 60) {
				segundosTotais = (segundos1 + segundos2) - 60;
				minutosTotais = 1;
			}
			else {
				segundosTotais = segundos1 + segundos2;
				minutosTotais = 0;
			}
			if (minutos1 + minutos2 >= 60) {
				minutosTotais += (minutos1 + minutos2) - 60;
				horasTotais = 1;
			}
			else {
				minutosTotais += minutos1 + minutos2;
				horasTotais = 0;
			}
			horasTotais += horas1 + horas2;
		}
	}

	@Override
	public String toString () {
		return "Passaram " + horasTotais + " horas, " + minutosTotais + " minutos e " + segundosTotais + " segundos!";
	}

}
