package com.paleale.boot.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hi")
	public @ResponseBody String hellowWorld(){
		return "Hello Noblehops trying pull request again!";
	}
}
