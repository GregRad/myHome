package pl.gregrad.myhome.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


public class ProductsDTO {
    private Long id;
    private String name;
    private String price;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
    private String category;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

	@Override
	public String toString() {
		return "ProductsDTO [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + ", category="
				+ category + "]";
	}
}

