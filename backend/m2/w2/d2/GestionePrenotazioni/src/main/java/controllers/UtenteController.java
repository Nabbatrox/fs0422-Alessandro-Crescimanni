package controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edoardotrovarelli.GestionePrenotazioni.Service.UtenteService;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Utente;


@RestController
@RequestMapping("/utenti/")
public class UtenteController {

	@Autowired
	UtenteService ut;

	
	@GetMapping("/utenti/")
	public Iterable<Utente> getAllUser(){
	
		return ut.getAllUtente();
	};
	

    @GetMapping("utenti/{subString}")
    public Page<Utente> getBySubString(@PathVariable("subString") String s, Pageable p){
        return ut.getByUtenteAndPaginate(s,p);
    }

  

    @PostMapping
    public Utente postUtente(
            @RequestParam("username") String username,
            @RequestParam("nomeCompleto") String nomeCompleto,
            @RequestParam("email") String email
            
            ) {
        
            Utente u = Utente.builder().
                    username(username).
                    nomeCompleto(nomeCompleto).
                    email(email).
                    build();
            ut.addUtente(u);
            return u;
        
    }
}
