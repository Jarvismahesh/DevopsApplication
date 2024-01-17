package com.bms.bean;

public class Bank {

	private long accountNo;
	private String accountHolder;
	private String accountType;
	private double accountBalance;
	private String phoneno;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(long accountNo, String accountHolder, String accountType, double accountBalance, String phoneno) {
		super();
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.phoneno = phoneno;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", accountHolder=" + accountHolder + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + ", phoneno=" + phoneno + "]";
	}

}
