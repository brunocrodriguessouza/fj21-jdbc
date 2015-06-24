package br.com.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();

		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("E-mail: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());

			Date dtNascimento = contato.getDataNascimento().getTime();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			String dtFormatada = formatter.format(dtNascimento);

			System.out.println("Data de Nascimento: " + dtFormatada + "\n");
		}
	}

}
