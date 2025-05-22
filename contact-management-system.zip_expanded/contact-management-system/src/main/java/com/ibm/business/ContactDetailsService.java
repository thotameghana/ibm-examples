package com.ibm.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ContactDetails;
import com.ibm.dao.ContactDetailsRepo;

@Service
public class ContactDetailsService {
	@Autowired
	private ContactDetailsRepo contactServiceDao;
	
	public ContactDetails findContact(int id) throws Exception{
		Optional<ContactDetails> user = contactServiceDao.findById(id);
		return user.orElseThrow(()-> new Exception ("Sorry id "+id+" is not found"));
	}
	
	public ContactDetails saveContact(ContactDetails contactDetails) {
		ContactDetails savedEntity = contactServiceDao.save(contactDetails);
		return savedEntity;
	}
	
	public void deleteContact(int id) throws Exception{
		ContactDetails contact = findContact(id);
		
		contactServiceDao.delete(contact);
	}
	
	
}
