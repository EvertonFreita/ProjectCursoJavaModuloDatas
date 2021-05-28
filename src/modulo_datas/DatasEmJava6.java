package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) throws ParseException{

		LocalDate localdate = LocalDate.now();
		System.out.println("Data atual: " + localdate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Ano atual: " + localdate.getYear());
		System.out.println("Mês atual: " + localdate.getMonthValue());
		System.out.println("Dia do mês: " + localdate.getDayOfMonth());
		System.out.println("Dia da semana: " + localdate.getDayOfWeek().name());
		System.out.println("Dia do ano: " + localdate.getDayOfYear());
		
	}

}
