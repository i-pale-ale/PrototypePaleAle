package com.paleale.boot.hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger("HelloController.class");
	@RequestMapping("/hi")
	public @ResponseBody String hellowWorld(){
		logger.debug("--Application hi test--");
		try {
			int i = 5 /0;
		}catch(Exception e) {
			logger.error("testing hi error", e);
		}
		return "Hello World!";
	}
}
