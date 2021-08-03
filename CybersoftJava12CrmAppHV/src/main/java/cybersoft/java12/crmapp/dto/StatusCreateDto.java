package cybersoft.java12.crmapp.dto;

public class StatusCreateDto {

	private int id;
	private String name;
	private String description;

	public StatusCreateDto(String name, String description, int id) {
		this.name = name;
		this.description = description;
		this.id = id;
	}

	public StatusCreateDto() {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
