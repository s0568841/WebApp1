package todolistehaupt.controller;

import todolistehaupt.entity.ToDoListeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todolistehaupt.services.ToDoListeService;

@RestController
public class ToDoListeController {

    @Autowired
    ToDoListeService service;

    @PostMapping(path = "/notes")
    public ToDoListeEntity createNote(@RequestBody ToDoListeEntity note)
    {
        return service.save(note);
    }

    @GetMapping(path = "/getNotes")
    public ToDoListeEntity getNote(@PathVariable String id)
    {
    long ToDoListeId = Long.parseLong(id);
    return service.get(ToDoListeId);
    }
}
