package br.com.julio.pontointeligente.api.repositories;

import br.com.julio.pontointeligente.api.entities.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

@Transactional(readOnly = true)
@NamedQueries({
        @NamedQuery(name = "LancamentoRepository.findByFuncionarioId",
                    query = "SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id = :funcionarioId") 
})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
    
    List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);
    
    Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);
    
}
