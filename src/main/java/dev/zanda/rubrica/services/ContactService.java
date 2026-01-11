package dev.zanda.rubrica.services;

import dev.zanda.rubrica.models.Contatto;
import dev.zanda.rubrica.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contatto> getAllService() {
        return contactRepository.findAll();
    }

    public List<Contatto> getContactByFirstName(String firstName) {
        return  contactRepository.getContactByNome(firstName);
    }

    public List<Contatto> getContactByLastName(String lastName) {
        return  contactRepository.getContactByCognome(lastName);
    }

    public Contatto save(Contatto contatto) {
        return contactRepository.save(contatto);
    }

    public void deleteById(int id) {
        if (!contactRepository.existsById(id)) {
            throw new RuntimeException("Contatto non trovato");
        }
        contactRepository.deleteById(id);
    }

    public Contatto update(int id, Contatto updated) {
        Contatto existing = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contatto non trovato"));

        existing.setNome(updated.getNome());
        existing.setCognome(updated.getCognome());
        existing.setEmail(updated.getEmail());
        existing.setNTel(updated.getNTel());

        return contactRepository.save(existing);
    }


}
