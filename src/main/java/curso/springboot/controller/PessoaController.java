package curso.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import curso.spring.springboot.model.Pessoa;
import curso.springboot.repository.PessoaRepository;

@Controller
@Transactional
public class PessoaController {

	@Autowired
	private PessoaRepository pessoarepository;

	@GetMapping("cadastros/cadastropessoa")
	public String cadastro() {
		return "cadastros/cadastropessoa";
	}

	@PostMapping("salvarpessoa")

	public String salvar(Pessoa pessoa) {

		pessoarepository.save(pessoa);
		return "cadastros/cadastropessoa";

	}
	
	@GetMapping("/listapessoa")
	
	public  ModelAndView pessoas() {
		
		ModelAndView tela = new ModelAndView("cadastros/cadastropessoa");
		Iterable<Pessoa> pessoas = pessoarepository.findAll();
		tela.addObject("pessoa", pessoas);
		return tela;
		
	}
	
	
}
