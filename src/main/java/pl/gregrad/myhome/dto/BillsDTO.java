package pl.gregrad.myhome.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class BillsDTO {

    private Long id;
    private String name;
    private String value;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime paymentDate;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
