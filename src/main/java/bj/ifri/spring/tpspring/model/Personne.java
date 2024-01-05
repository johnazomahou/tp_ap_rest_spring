package bj.ifri.spring.tpspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Temporal;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personne")
@Getter
@Setter
public class Personne {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "Prenom", nullable = false)
    private String prenom;

   @Temporal(TemporalType.DATE)
   @Column(name = "DateNaissance", nullable = false)
   private Date dateNaissance;

   

}
