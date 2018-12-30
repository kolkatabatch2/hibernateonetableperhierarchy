package account;
import javax.persistence.*;

@Entity
@Table(name="BillingTable")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="BILLING_DETAILS_TYPE",
		discriminatorType=DiscriminatorType.STRING)
public abstract class Billing_Details {

	public Billing_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected String owner;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BILLING_DETAILS_ID")
	protected long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
}
