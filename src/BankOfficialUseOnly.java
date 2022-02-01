
public class BankOfficialUseOnly extends Bank{

	@Override
	public void bankRegisterNo() {
		System.out.println("bank Registrer no is RTYUU23456787");
	}

	@Override
	public void bankRepoRate() {
		System.out.println("bank repo rate is 12%");
	}
	public static void main(String[] args) {
		BankOfficialUseOnly a = new BankOfficialUseOnly();
		a.bankAddress();
		a.bankName();
		a.bankRegisterNo();
		a.bankRepoRate();
		
	}

}
