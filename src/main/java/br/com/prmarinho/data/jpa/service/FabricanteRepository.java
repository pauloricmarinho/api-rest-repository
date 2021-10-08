package br.com.prmarinho.data.jpa.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.prmarinho.data.jpa.domain.Fabricante;

@RepositoryRestResource(collectionResourceRel = "fabricante", path = "fabricantes")
public interface FabricanteRepository extends PagingAndSortingRepository<Fabricante, Integer> {

}
