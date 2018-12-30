package account;
import javax.persistence.*;

@Entity
@DiscriminatorValue("CC")
public class Credit_Card extends Billing_Details{

	public Credit_Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String number;
	private String exp_Month;
	private String exp_Year;

	
	public String getExp_Month() {
		return exp_Month;
	}	
	
	public void setExp_Month(String exp_Month) {
		this.exp_Month = exp_Month;
	}
	
	public String getExp_Year() {
		return exp_Year;
	}
	public void setExp_Year(String exp_Year) {
		this.exp_Year = exp_Year;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
