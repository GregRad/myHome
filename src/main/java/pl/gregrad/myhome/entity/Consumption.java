package pl.gregrad.myhome.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "Consumption")
public class Consumption {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String unit;
    private LocalDate date;
    private String value;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
