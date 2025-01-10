package in.vtech.springboot.web;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.vtech.springboot.web.todo.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todoCount =0;
	static {
		todos.add(new Todo(++todoCount, "vtech", "Get AWS CErtified", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "vtech", "Learn Devops", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "vtech", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description){
		Todo todo = (new Todo(++todoCount,username,description,LocalDate.now().plusYears(3), false));
		todos.add(todo);
	}

}
