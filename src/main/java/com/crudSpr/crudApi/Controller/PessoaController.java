package com.crudSpr.crudApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crudSpr.crudApi.Model.Pessoa;
import com.crudSpr.crudApi.Repository.PessoaRespository;

@RestController
public class PessoaController {
     
	@Autowired
	private PessoaRespository pessoaRespository;
	
	//Mostrando todos os dados do banco
	@RequestMapping(value = "/pessoa", method = RequestMethod.GET)
	public List<Pessoa> Get() {
		return pessoaRespository.findAll();
	}
	
}
