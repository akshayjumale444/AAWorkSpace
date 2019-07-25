package lti;
import java.time.LocalDate;

public class PAccount 
{
	private int id;
	private String name;
	private LocalDate date;
	private double balance;
	
	public PAccount() {
		// TODO Auto-generated constructor stub
	}

	public PAccount(int id, String name, LocalDate date, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getD() {
		return date;
	}

	public void setD(LocalDate d) {
		this.date = d;
	}

	public double getBal() {
		return balance;
	}

	public void setBal(double bal) {
		this.balance = bal;
	}

	@Override
	public String toString() {
		return "PAccount [id=" + id + ", name=" + name + ", d=" + date + ", bal=" + balance + "]";
	}
	
	
	
}
