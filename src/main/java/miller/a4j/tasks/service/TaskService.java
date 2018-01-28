package miller.a4j.tasks.service;

import miller.a4j.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
