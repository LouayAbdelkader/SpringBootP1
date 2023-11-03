package tn.iset.springproject.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long idEtudiant;
  String nomEtudiant;
  String prenomEtudiant;
  Date dateNais;
}
