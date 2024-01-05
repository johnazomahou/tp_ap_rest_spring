package bj.ifri.spring.tpspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.spring.tpspring.model.Conducteur;


public interface ConducteurRepository extends JpaRepository<Conducteur, Integer> {
    
}


