package br.com.tutorial.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import br.com.tutorial.bean.Pessoa;
import br.com.tutorial.dao.PessoaDAO;

import com.opensymphony.xwork2.ActionSupport;

public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;
	private List<Pessoa> lista;

	
	@Action(value = "cadastrar", results = {
			@Result(name = "sucesso", location = "/cadastro.jsp") })
	public String cadastrar() {
		try {
			PessoaDAO.cadastra(pessoa);
			addActionMessage("Pessoa cadastrado com sucesso!");
			lista = PessoaDAO.recuperaTodos();
			return "sucesso";
		} catch (Exception e) {
			e.printStackTrace();
			addActionError("Deu erro!");
			return "erro";
		}
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Pessoa> getLista() {
		return lista;
	}
	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	
}
