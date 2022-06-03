package com.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crm.enities.Lead;
import com.crm.repositories.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LeadDataTest {

	@Autowired
	LeadRepository leadRepo;
	
	@Test
	public void saveOneLead() {
		Lead l = new Lead("Pradip", "solunke", "psolunke95@gmail.com","radio",9689648438L);
		leadRepo.save(l);
	}
}
