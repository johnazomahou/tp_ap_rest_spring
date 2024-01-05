package bj.ifri.spring.tpspring.Controller;

import bj.ifri.spring.tpspring.model.Voiture;
import bj.ifri.spring.tpspring.Repository.VoitureRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voitures")
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping
    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    @GetMapping("/{id}")
    public Voiture getVoitureById(@PathVariable int id) {
        return voitureRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Voiture createVoiture(@RequestBody Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @DeleteMapping("/{id}")
    public void deleteVoiture(@PathVariable int id) {
        voitureRepository.deleteById(id);
    }

    @GetMapping("/count")
    public long countVoiture() {
        return voitureRepository.count();
    }
}
