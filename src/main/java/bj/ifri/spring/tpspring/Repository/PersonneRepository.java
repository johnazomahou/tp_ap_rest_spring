package bj.ifri.spring.tpspring.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.spring.tpspring.model.Personne;


public interface PersonneRepository extends JpaRepository<Personne, Integer> {
// 
}


