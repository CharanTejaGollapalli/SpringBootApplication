package in.vtech.springboot.web.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authentication(String name, String password) {
		
//		boolean isValidPassword = password.equalsIgnoreCase("Charan");
		if(name.isEmpty()) {
			return false;
		}
		else{
			return true;
		}
		
//		if(name.equals("Charan") && password.equals("1234")) {
//		if(password.equals("1234")) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	public AuthenticationService() {
		
	}
}
