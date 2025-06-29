package com.cristian.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface iTaskRepository extends JpaRepository<TaskModel, UUID>{
    List<TaskModel> findByIdUser(UUID idUser);
    TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}