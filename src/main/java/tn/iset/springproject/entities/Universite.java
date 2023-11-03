package tn.iset.springproject.entities;

import com.fasterxml.jackson.core.SerializableString;
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
public class Universite  {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  long idUniversite;
  String nomUniversite;
  @OneToOne
  Foyer foyer;


}
