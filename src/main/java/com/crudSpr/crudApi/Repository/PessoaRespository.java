package com.crudSpr.crudApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudSpr.crudApi.Model.Pessoa;

public interface PessoaRespository extends JpaRepository<Pessoa, Long> {

}
