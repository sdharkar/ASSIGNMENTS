package springMVCQ4.Controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springMVCQ4.Dao.UserDao;
import springMVCQ4.Model.*;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView userRegistration(@RequestParam("username") String username,
										@RequestParam("password") String password,
										@RequestParam("email") String email)
	{
		
		ModelAndView mv=new ModelAndView();
		User user=(User) new LoginController();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		
		int counter= userDao.registerUser(user);
		if(counter>0)
		{
			mv.addObject("msg","User Registration Successful");
		}
		else
		{
			mv.addObject("msg","Error- check the log");
		}
		mv.setViewName("registration");
		return mv;
	}
}
