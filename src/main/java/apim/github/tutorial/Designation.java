package apim.github.tutorial;

public class Designation {

	private String post;
	private String unit;

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String toString() {
		return post + ": " + unit;
	}
}