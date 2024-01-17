package com.bms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bean.Bank;
import com.bms.dao.BankDAO;

@RestController
public class BankController {

	@Autowired
	BankDAO dao;

	public String performInsert(Bank bean) {
		try {
			dao.insert(bean);
			List<Bank> list = dao.view();
			System.out.println(list);

			return "Insert Successfully";
		} catch (Exception e) {
			return "Insert Unsuccessful";
		}
	}

}
