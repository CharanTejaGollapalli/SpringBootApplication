package in.vtech.springboot.web.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import in.vtech.springboot.web.TodoService;

@Controller
@SessionAttributes({"name","password"})
public class TodoController {

	private TodoService todoService;
	public TodoController(TodoService todoService) {
		super();
		this.todoService=todoService;
	}

	// http://localhost:8081/list-tools => listTodos.jsp
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String gotoListTodoPage(ModelMap model) {
		List<Todo> todo=todoService.findByUsername("vtech");
		model.put("todos",todo);
		return "listTodos5";
	}
	
//	@RequestMapping(value = "/list-todos1", method = RequestMethod.GET)
//	public String gotoListTodoPage() {
//		return "listTodos1";
//	}
	
	//http://localhost:8081/add-todo
	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo1";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String showAllTodos(@RequestParam String description,ModelMap model) {
		String username =(String)model.get("name");
		todoService.addTodo(username, description);
		return "redirect:list-todos";
	}
	}
