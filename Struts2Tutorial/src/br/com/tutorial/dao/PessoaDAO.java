package br.com.tutorial.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.tutorial.bean.Pessoa;

public class PessoaDAO {
	
	private static List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public static void cadastra(Pessoa aluno){
		lista.add(aluno);
	}
	
	public static List<Pessoa> recuperaTodos(){
		return lista;
	}
}
