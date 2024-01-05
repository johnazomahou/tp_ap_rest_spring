package bj.ifri.spring.tpspring.model;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "conducteur")
@Getter
@Setter

public class Conducteur {

    @Id
	@GeneratedValue
    private int id;

    @Column(name = "TypePermis", nullable = false)
    @Enumerated(EnumType.STRING) 
    private TypePermis typePermis;

    @Temporal(TemporalType.DATE)
    @Column(name = "DatePermis", nullable = false)
    private Date DatePermis;

    @ManyToOne
    @JoinColumn(name = "idPersonne")

    private Personne personne;

  

}
