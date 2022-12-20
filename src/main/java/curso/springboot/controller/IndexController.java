package curso.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class IndexController {

	@RequestMapping(method = RequestMethod.GET,value = "index")
	public String pagina() {
		return "index";
	}
}
