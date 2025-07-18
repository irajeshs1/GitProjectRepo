package in.nic.GitProjectRepo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	 @GetMapping("/")
	    public ResponseEntity<?> getUserById(){
	    	System.out.println(" [X-Custom-Header] ");
	        return new ResponseEntity<>("Rest API", HttpStatus.OK);
	    }
	 
}
