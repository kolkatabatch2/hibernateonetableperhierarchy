package account;
import javax.persistence.*;

@Entity
@DiscriminatorValue("BA")
public class Bank_Account extends Billing_Details{

	public Bank_Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String account;
	private String bank_name;

	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
}
