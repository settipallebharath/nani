package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellocontroller
{
@RequestMapping("/greet")
public String sayhello()
{
	return "greet";
}
}
