package apim.github.tutorial;

public class CustomerCBI {

	private int cId;
	private String cName;

	public void customInit() {
		System.out.println("Custom Bean Initialisation...");
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
}