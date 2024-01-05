package bj.ifri.spring.tpspring.Controller;

import bj.ifri.spring.tpspring.model.Conducteur;
import bj.ifri.spring.tpspring.Repository.ConducteurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Conducteurs")
public class ConducteurController {

    @Autowired
    private ConducteurRepository conducteurRepository;

    @GetMapping
    public List<Conducteur> getAllConducteurs() {
        return conducteurRepository.findAll();
    }

    @GetMapping("/{id}")
    public Conducteur getConducteurById(@PathVariable int id) {
        return conducteurRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Conducteur createConducteur(@RequestBody Conducteur conducteur) {
        return conducteurRepository.save(conducteur);
    }

    @DeleteMapping("/{id}")
    public void deleteConducteur(@PathVariable int id) {
        conducteurRepository.deleteById(id);
    }

    @GetMapping("/count")
    public long countConducteur() {
        return conducteurRepository.count();
    }
}
