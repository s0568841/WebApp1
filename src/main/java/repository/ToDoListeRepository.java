package repository;

import entity.ToDoListeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListeRepository extends CrudRepository<ToDoListeEntity, Long> {}
