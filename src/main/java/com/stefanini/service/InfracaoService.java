package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import com.stefanini.model.Infracao;
import com.stefanini.repository.InfracaoRepository;

@Stateless
public class InfracaoService {

	@Inject
	private InfracaoRepository repo;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Infracao i) {
		repo.incluir(i);
	}
	
}
