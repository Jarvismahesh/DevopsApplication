package com.bms;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bms.bean.Bank;
import com.bms.controller.BankController;
import com.bms.dao.BankDAO;

@SpringBootApplication
public class BankAppApplication {

	static BankDAO dao = new BankDAO();

	public Bank AccountDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter AccNo,AccHolder,AccType,AccBalance and PhoneNo");

		// public Bank(long accountNo, String accountHolder, String accountType, double accountBalance, String phoneno)
		return new Bank(sc.nextLong(), sc.next(), sc.next(), sc.nextDouble(), sc.next());
	}

	public static void main(String[] args) {
		// SpringApplication.run(BankAppApplication.class, args);

		BankAppApplication obj = new BankAppApplication();

		Bank bean = obj.AccountDetails();

		BankController control = new BankController();
		System.out.println(control.performInsert(bean));

	}

}
