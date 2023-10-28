package Exam_Part_02;

public class CreateObjectOneWay {
	private String name;
	private String addres;
	
	public CreateObjectOneWay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateObjectOneWay(String name, String addres) {
		super();
		this.name = name;
		this.addres = addres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "CreateObjectOneWay [name=" + name + ", addres=" + addres + "]";
	}
	
	

}
