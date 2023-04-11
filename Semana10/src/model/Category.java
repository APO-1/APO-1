package model;

public enum Category {

	TRANSPORT,
	DINNER,
	SERVICES,
	HEALTH,
	UNIVERSITY,
	OTHER("definition");

	private String value;

	private Category(String value) {
		this.value = value;
	}

	private Category() {
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
