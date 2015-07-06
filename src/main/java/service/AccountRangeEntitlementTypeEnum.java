package service;

public enum AccountRangeEntitlementTypeEnum {
	FIRST("61400000", "61409999"), 
	SECOND("85155000", "85159999"), 
	THIRD("89600000", "89699999"), 
	FOURTH("91525000", "91539999");

	private String fromAccount;
	private String toAccount;

	private AccountRangeEntitlementTypeEnum(String fromAccount, String toAccount) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}
	
	
}
