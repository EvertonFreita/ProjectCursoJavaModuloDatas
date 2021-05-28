package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = sdf.parse("10/05/2021");

		Date dataAtual = sdf.parse("05/05/2021");
		
		// com before compara se a data 1 vem antes ou é menor do que a data 2
		// com after compara se a data 1 vem depois ou é maior do que a data 2
		
		if (dataVencimentoBoleto.before(dataAtual)) {

			System.out.println("Boleto vencido - URGENTE");

		} else {

			System.out.println("Boleto não vencido");
		}
		
		/*if (dataVencimentoBoleto.after(dataAtual)) {

			System.out.println("Boleto vencido - URGENTE");

		} else {

			System.out.println("Boleto não vencido");
		}*/

	}
}
