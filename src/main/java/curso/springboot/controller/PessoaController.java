package curso.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PessoaController {

	@RequestMapping(method = RequestMethod.GET,value="/cadastropessoa")
	
	public String cadastro() {
		return "cadastro/cadastropessoa";
	}
}
