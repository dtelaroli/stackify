package br.com.benevix.stackify;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LogController {

	@GetMapping("/stackify")
    public String stackify() {
//    	com.stackify.api.common.log.direct.Logger.queueMessage("INFO", "BOOT STACKIFY MESSAGE");
        return "test stackify";
    }
    
	@GetMapping("/logback")
	public String logback() {
    	org.slf4j.LoggerFactory.getLogger(getClass()).info("BOOT LOGBACK MESSAGE");
		return "test logback";
	}
	
	@GetMapping("/java")
	public String java() {
    	java.util.logging.Logger.getLogger(getClass().getCanonicalName()).info("BOOT JAVALOGGING MESSAGE");
		return "test java";
	}
}
