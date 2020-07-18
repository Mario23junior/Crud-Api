package com.crudSpr.crudApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//Listando dados por id 
	@RequestMapping(value = "/pessoa/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pessoa> GetById(@PathVariable(value = "id") long id){
		
		Optional<Pessoa> pessoa = pessoaRespository.findById(id);
		 if(pessoa.isPresent()) {
			 return new ResponseEntity<Pessoa>(pessoa.get(), HttpStatus.OK);
		 }else {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }
 	}
	
}





