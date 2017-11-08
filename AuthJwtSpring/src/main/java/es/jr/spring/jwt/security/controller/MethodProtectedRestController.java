package es.jr.spring.jwt.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("protected")
public class MethodProtectedRestController {

	 /**
     * Restricciones granulares para endpoints.
     * se pueden usar expresiones en @PreAuthorize. Con 'hasRole()' se define si un usuario tiene acceso.
     * 'hasRole()' asume que el valor lleva el prefijo 'ROLE_' en todos los nombres de rol, por lo que 'ADMIN' en realidad es
     * 'ROLE_ADMIN' en bdd
     **/
	
	@RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> getProtectedGreeting() {
        return ResponseEntity.ok("Saludos desde un metodo protegido para admins");
    }
	
}
