package br.com.fatecararas.dao;

import br.com.fatecararas.model.Contato;

import java.util.List;

public interface ContatoDAO {
    void save (Contato contato);
    Contato update (Contato contato);
    Contato searchByName (String nome);
    boolean delete (Contato contato);
    List<Contato> searchAll ();

}
