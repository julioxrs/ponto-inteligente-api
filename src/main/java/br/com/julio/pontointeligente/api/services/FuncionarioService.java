package br.com.julio.pontointeligente.api.services;

import br.com.julio.pontointeligente.api.entities.Funcionario;

import java.util.Optional;

public interface FuncionarioService {


    /**
     * Persiste funcionario na base de dados
     *
     * @param funcionario
     * @return Funcionario
     */
    Funcionario persistir(Funcionario funcionario);

    /**
     * Busca funcionario por cpf.
     *
     * @param cpf
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorCpf(String cpf);

    /**
     * Busca funcionario por email
     *
     * @param email
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorEmail(String email);

    /**
     * Busca funcionario por Id
     *
     * @param id
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorId(Long id);


}
