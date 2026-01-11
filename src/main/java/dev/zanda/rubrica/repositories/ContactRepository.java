package dev.zanda.rubrica.repositories;

import dev.zanda.rubrica.models.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contatto, Integer> {

    List<Contatto> getContactByNome(String nome);

    List<Contatto> getContactByCognome(String cognome);
}
