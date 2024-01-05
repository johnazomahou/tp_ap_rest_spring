package bj.ifri.spring.tpspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "voiture")
@Getter
@Setter
public class Voiture {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Puissance", nullable = false)
    private int puissance;

    @Column(name = "Kilometrage", nullable = false)
    private int kilometrage;

    @Column(name = "Type", nullable = false)
    private String type;

    @Column(name = "NbPorte", nullable = false)
    private int nbPorte;

    @ManyToOne
    @JoinColumn(name = "idPersonne", nullable = false)
    private Personne personne;

  
}
