package br.gama.projagenda.dao;

import org.springframework.data.repository.CrudRepository;

import br.gama.projagenda.model.Agencia;

public interface AgenciaDAO extends CrudRepository<Agencia, Integer> {
    // fazendo isso a gente ja ganha varios metodos, como find all, find by id, etc
}