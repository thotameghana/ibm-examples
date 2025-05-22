package com.ibm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.ContactDetails;

public interface ContactDetailsRepo extends JpaRepository<ContactDetails, Integer>{
	@Query("select count(e) from ContactDetails e where e.user_id = ?1")
    public int countOfContactsByUserId(int userId);
	
	@Query("select e from ContactDetails e where e.user_id=?1")
	public List<ContactDetails> showAllContacts(int userId);
	
	@Query("select e from ContactDetails e where e.name=?1")
	public List<ContactDetails> contactsByName(String name);
}
