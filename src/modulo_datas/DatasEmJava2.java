package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {
		
		
        Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Data em milisecundos: " + date.getTime());
		
		System.out.println("Calendar em milisecundos: " + calendar.getTimeInMillis());
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Mês: " + date.getMonth());
		
		System.out.println("Mês com calendar: " + calendar.get(Calendar.MONTH));
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Dia do mês: " + date.getDate());
		
		System.out.println("Dia do mês com calendar: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("Dia da semana com calendar: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Hora do dia com calendar: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Minuto da hora: " + date.getMinutes());
		
		System.out.println("Minuto da hora com calendar: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Segundos com calendar: " + calendar.get(Calendar.SECOND));
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		
		System.out.println("Ano com calendar: " + calendar.get(Calendar.YEAR));
		
		System.out.println("--------------------------------------------");
		
		//-------------------Simple Date Format----------------------------
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrão e String: " + sdf.format(date));
		
		System.out.println("Data atual em formato padrão e String com calendar: " + sdf.format(calendar.getTime()));
		
		System.out.println("--------------------------------------------");
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato para banco de dados: " + sdf.format(date));
		
		System.out.println("Data em formato para banco de dados com calendar: " + sdf.format(calendar.getTime()));
		
		System.out.println("--------------------------------------------");
		
	    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Objeto Date: " + sdf2.parse("1987-10-18 20:10.2"));
	}
}
