package com.nic.taskdb.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.nic.taskdb.model.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

    // define helper methods for querying DB here.

    List<Task> findAll();
    List<Task> findAllByOrderByUrgentDesc();
}