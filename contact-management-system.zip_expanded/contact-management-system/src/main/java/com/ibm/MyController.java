package com.ibm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.business.ContactDetailsService;
import com.ibm.business.UserService;
import com.ibm.dao.ContactDetailsRepo;

@RestController
@RequestMapping("/api/user" )
@CrossOrigin("*")
public class MyController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private ContactDetailsService contactDeatilsService;
	
	@Autowired
	private ContactDetailsRepo contactDeatilsRepo;
	
	@PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody User user){
		User savedEntity= userService.saveUser(user);
		
		return ResponseEntity.status(200).body(savedEntity);
	}
	
	@GetMapping(path="/{id}")//it can accept any value like 100, 101....
	public ResponseEntity<Object> get(@PathVariable("id") int userId){
		try {
			User user=userService.findUser(userId);
			return ResponseEntity.status(200).body(user);
		}
		catch(Exception e) {
			Map<String, String> errorMap= new HashMap<String,String>();
			errorMap.put("message", e.getMessage());
			return ResponseEntity.status(404).body(errorMap);
		}
	}
	
	@PostMapping(path = "/contact", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody ContactDetails contactDetails) {
	    ContactDetails savedEntity = contactDeatilsService.saveContact(contactDetails);
	    return ResponseEntity.status(200).body(savedEntity);
	}
	
	@GetMapping(path = "/contact/{id}")
    public ResponseEntity<Object> getCountOfContacts(@PathVariable("id") int id) {
        int count = contactDeatilsRepo.countOfContactsByUserId(id);
        // You can use ResponseEntity.ok(count) as a shorthand for status 200
        return ResponseEntity.ok(count);
    }
	
	@DeleteMapping(path = "/contact/delete/{id}")
	public ResponseEntity<Object> deleteContact(@PathVariable("id") int id) {
		try {
			contactDeatilsService.deleteContact(id);
			return ResponseEntity.status(200).body("Succesfully deleted");
		}
		catch(Exception e) {
			Map<String,String> errorMap=new HashMap<>();
			errorMap.put("message", e.getMessage());
			return ResponseEntity.status(404).body(errorMap);
		}
	}
	
	@GetMapping(path="/contact/all/{id}")
	public ResponseEntity<Object> getAllContactsByUid(@PathVariable("id") int id){
		List<ContactDetails> e=contactDeatilsRepo.showAllContacts(id);
//		return ResponseEntity.status(200).body(e);
		return ResponseEntity.ok(e);
	}
	
	@GetMapping(path = "/contact/name/{name}")
	public ResponseEntity<Object> getAllContactsByName(@PathVariable("name") String name){
		List<ContactDetails> e=contactDeatilsRepo.contactsByName(name);
		
		return ResponseEntity.ok(e);
	}
	
	@PutMapping(path="update/{id}" ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> update(@PathVariable("id") int id, @RequestBody User u){
		u.setUserId(id);
		User updatedUser=null;
		try {
			updatedUser = userService.updatePassword(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(200).body(updatedUser);
	}
	
}
