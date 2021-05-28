package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava7 {

	public static void main(String[] args) throws ParseException, InterruptedException{

		LocalDate dataAntiga = LocalDate.parse("2019-10-08");
		
		LocalDate dataNova = LocalDate.parse("2021-04-10");
		
		System.out.println("Data antiga � maior que a data nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga � anterior que a data nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("As datas s�o iguais: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays());
		System.out.println("Quantos meses: " + periodo.getMonths());
		System.out.println("Quantos anos: " + periodo.getYears());
		
		System.out.println("A diferen�a do per�odo entre a data antiga at� a data atual � de: " + periodo.getYears() + " anos "
		+ periodo.getMonths() + " meses " + periodo.getDays() + " dias" );
	}

}
