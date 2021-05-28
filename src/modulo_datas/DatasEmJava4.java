package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException{

		
		Calendar calendar = Calendar.getInstance();
		
		for(int parcela = 1; parcela <= 12; parcela ++) {
			
			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela número " + parcela + " : " + " vencimento em: "
			+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
		}
		
	}

}
