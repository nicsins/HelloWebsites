package com.nic.demo.Repository;

import com.nic.demo.Model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository <Task,Long> {
}
