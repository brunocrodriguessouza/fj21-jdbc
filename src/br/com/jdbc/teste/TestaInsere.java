package br.com.jdbc.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Gabriel");
		contato.setEmail("brunoprogramadorjava@gmail.com");
		contato.setEndereco("Rua Felisberto Gomes Barca, 252");
		
		try {
			String dataEmTexto = "01/03/2010";
			Calendar dataNascimento = formatarData(dataEmTexto);
			contato.setDataNascimento(dataNascimento);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//grave nessa conexao
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
		
	}

	private static Calendar formatarData(String dataEmTexto)
			throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		return dataNascimento;
	}

}
