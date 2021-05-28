package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Data atual : " + sdf.format(calendar.getTime()));

		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));

		System.out.println("Sem somar o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(calendar.DAY_OF_MONTH, 5);

		System.out.println("Somando o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.DAY_OF_MONTH, -5);

		System.out.println("Subtraindo o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));


		calendar.add(calendar.MONTH, 1);

		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.YEAR, 1);
		
		System.out.println("Somando um ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
