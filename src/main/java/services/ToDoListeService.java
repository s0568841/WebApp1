package services;

import entity.ToDoListeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ToDoListeRepository;

@Service
public class ToDoListeService {

    @Autowired
    ToDoListeRepository repo;

    public ToDoListeEntity save(ToDoListeEntity note){
        repo.save(note);
        return note;
    }

    public ToDoListeEntity get(Long id){
        return repo.findById(id).orElseThrow(()-> new RuntimeException());
    }
}
