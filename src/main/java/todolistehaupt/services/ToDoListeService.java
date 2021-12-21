package todolistehaupt.services;

import todolistehaupt.entity.ToDoListeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolistehaupt.repository.ToDoListeRepository;

@Service
public class ToDoListeService {

    ToDoListeService () {}

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
