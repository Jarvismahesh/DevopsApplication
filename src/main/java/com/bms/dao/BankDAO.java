package com.bms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bms.bean.Bank;

@Repository
public class BankDAO {

	static List<Bank> list;

	public static boolean insert(Bank bean) {
		list = new ArrayList<Bank>();

		list.add(bean);

		return true;
	}

	public static List<Bank> view() {
		return list;
	}

}
