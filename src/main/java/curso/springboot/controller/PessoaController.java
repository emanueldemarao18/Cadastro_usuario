package curso.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import curso.spring.springboot.model.Pessoa;
import curso.springboot.repository.PessoaRepository;

@Controller
@Transactional
public class PessoaController {

	@Autowired
	private PessoaRepository pessoarepository;

	@GetMapping("cadastros/cadastropessoa")

	public String cadastros() {
		return "cadastros/cadastropessoa";
	}

	@PostMapping("salvar")

	public String cadastrar(Pessoa pessoa) {
		pessoarepository.save(pessoa);
		return "cadastros/cadastropessoa";// Retornar para cadastros/cadastropessoa
	}
}
