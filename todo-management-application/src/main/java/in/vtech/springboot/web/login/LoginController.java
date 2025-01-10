package in.vtech.springboot.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import in.vtech.springboot.web.login.AuthenticationService;

@Controller
@SessionAttributes({"name","password"})
public class LoginController {
	
	AuthenticationService auth;
	
	public LoginController(AuthenticationService auth) {
		super();
		this.auth=auth;
	}
	

//	private Logger logger=LoggerFactory.getLogger(this.getClass());

	// http://localhost:8081/login=>login1.jsp
//	@RequestMapping("/login")
//	public String loginForm(Model model){
//		model.addAttribute("message", "Hey how are you ?");
//		return "login1";
//	}

	// http://localhost:8081/login?name=Charan
//	@RequestMapping("/login")
//	public String gotoLoginPAge(@RequestParam String name) {
//		System.out.println("Request Param name "+name);
//		return "login1";
//	}

	// Model //EL
//	//http://localhost:8081/login?name=Charan
//	@RequestMapping("/login")
//	public String gotoLoginPAge(@RequestParam String name, ModelMap model) {
////		System.out.println("Request Param name "+name);
//		
//		model.put("name", name);
////		logger.debug("Request param is: "+ name);
////		logger.info("I want to print this at logging");
////		logger.warn("I want to print this as error");
//		return "login2";
//	}

	// http://localhost:8081/login1?name=Charan$password=123
//	@RequestMapping("/login1")
//	public String gotoLoginPAge1(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		System.out.println("Request Param name "+name);
//
//		model.put("name", name);
//		model.put("password", password);
//		return "login3";
//	}

//	// http://localhost:8081/login?name=Charan$password=123
//	@RequestMapping("/login")
//	public String gotoLoginPAge(ModelMap model) {
//		return "login4";
//	}
	
	// http://localhost:8081/login?name=Charan$password=123
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String gotoLoginPAge() {
		return "login";
	}
	
	
//Authentication
	
	// http://localhost:8081/login?name=Charan$password=123
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String gotoLoginPAge1(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(auth.authentication(name, password)){
			model.put("name", name);
			model.put("password", password);
		return "welcome2";
		}
		else {
			model.put("errorMessage", "Invalid Credentials");
			return "login5";
		}
	}
	
	// http://localhost:8081/list-tools => listTodos.jsp
//	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
//	public String gotoListTodoPage() {
//		return "listTodos1";
//	}
	
//	@RequestMapping(value = "/list-todos1", method = RequestMethod.GET)
//	public String gotoListTodoPage() {
//		return "listTodos1";
//	}
}
