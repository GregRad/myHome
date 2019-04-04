package pl.gregrad.myhome.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class ConsumptionDTO {

    private Long id;
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
    private String value;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
}
