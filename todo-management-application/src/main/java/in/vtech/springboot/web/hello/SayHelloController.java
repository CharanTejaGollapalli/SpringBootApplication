package in.vtech.springboot.web.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"Say-Hello" => "Hello! What are you learning today ?"
	
	// "/say-hello"
	// http://localhost:8081/say-hello
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today ?";
	}
	// http://localhost:8081/say-hello-html
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First HTML Page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//View - JSP - Java Server Pages
	// "/say-hello-jsp" => sayHello.jsp
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello1";
	}
	@RequestMapping("/roo")
	public String sayByeToRo() {
		return "roo";
	}
}
