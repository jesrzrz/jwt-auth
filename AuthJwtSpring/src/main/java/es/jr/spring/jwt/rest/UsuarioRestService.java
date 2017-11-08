package es.jr.spring.jwt.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestService {

	private static final List<Usuario> persons;
	
	 static {
	        persons = new ArrayList<>();
	        persons.add(new Usuario("Hello", "World"));
	        persons.add(new Usuario("Foo", "Bar"));
	}

	 
	 @RequestMapping(path = "/usuarios", method = RequestMethod.GET)
	    public static List<Usuario> getPersons() {
	        return persons;
	    }

	    @RequestMapping(path = "/usuarios/{name}", method = RequestMethod.GET)
	    public static Usuario getPerson(@PathVariable("name") String name) {
	        return persons.stream()
	                .filter(person -> name.equalsIgnoreCase(person.getNombre()))
	                .findAny().orElse(null);
	}
	 
}
