package com.bms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bms.bean.Bank;
import com.bms.dao.BankDAO;

@SpringBootTest
class BankAppApplicationTests {
	@Autowired
	BankDAO dao;

	/*
	 * @Before public void init() { Bank bean = new
	 * Bank(2898990,"Karthi","SavingAccount",9090,"8978675656"); }
	 * 
	 * 
	 * @After public void reset() { bean = null; }
	 */

	@Test
	void contextLoads() {
	}

	Bank bean = new Bank(2898990, "Karthi", "SavingAccount", 9090, "8978675656");

	@Test
	public void DAOTest() {
		boolean val = dao.insert(bean);
		Assertions.assertEquals(true, val);
	}

}
