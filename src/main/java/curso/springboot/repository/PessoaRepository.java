package curso.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import curso.spring.springboot.model.Pessoa;
	@Repository
	public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

	
}
