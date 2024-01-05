package bj.ifri.spring.tpspring.Controller;

import bj.ifri.spring.tpspring.model.Personne;
import bj.ifri.spring.tpspring.Repository.PersonneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnes")
public class PersonneController {

    @Autowired
    private PersonneRepository personneRepository;

    @GetMapping
    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }

    @GetMapping("/{id}")
    public Personne getPersonneById(@PathVariable int id) {
        return personneRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Personne createPersonne(@RequestBody Personne personne) {
        return personneRepository.save(personne);
    }

    @DeleteMapping("/{id}")
    public void deletePersonne(@PathVariable int id) {
        personneRepository.deleteById(id);
    }

    @GetMapping("/count")
    public long countPersonnes() {
        return personneRepository.count();
    }
}
