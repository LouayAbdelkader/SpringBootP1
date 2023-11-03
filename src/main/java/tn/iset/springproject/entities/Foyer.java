package tn.iset.springproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  long idFoyer;
  String nomFoyer;
  long capacite;
  @OneToOne(mappedBy = "foyer")
  Universite universite;

}
