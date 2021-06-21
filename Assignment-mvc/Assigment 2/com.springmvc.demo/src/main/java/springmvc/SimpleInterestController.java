package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleInterestController {
	
	
	
	@RequestMapping("simple")
	public String hello(Model model) {
		
		return "simpleInterest";
			
		}
	
		
	 @RequestMapping(value="/process", method=RequestMethod.POST)
	 public String simple(@ModelAttribute() Simple simple ) { 
			   
		  System.out.println(simple);
		  return "SimSol";
		  }
		 	

}
