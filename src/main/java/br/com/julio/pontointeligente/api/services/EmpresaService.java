package br.com.julio.pontointeligente.api.services;

import br.com.julio.pontointeligente.api.entities.Empresa;

import java.util.Optional;

public interface EmpresaService {

    /**
     * Retorna uma empresa passando um CNPJ
     *
     * @param cnpj
     * @return Optional<Empresa>
     */
    Optional<Empresa> buscarPorCnpj(String cnpj);


    /**
     * Cadastra uma nova empresa na base de dados.
     *
     * @param empresa
     * @return
     */
    Empresa persistir(Empresa empresa);

}
