package br.com.prmarinho.data.jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.prmarinho.data.jpa.domain.Equipamento;

@RepositoryRestResource(collectionResourceRel = "equipamento", path = "equipamentos")
interface EquipamentoRepository extends PagingAndSortingRepository<Equipamento, Integer> {

	Page<Equipamento> findByDescricaoContainingAndFabricanteContainingAllIgnoringCase(String descricao,String fabricante, Pageable pageable);
	
	Equipamento findByDescricaoIgnoringCase(String descricao);
	
}
