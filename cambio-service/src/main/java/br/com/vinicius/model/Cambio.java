package br.com.vinicius.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity(name = "cambio")
public class Cambio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "from_currency", nullable = false, length = 3)
    private String form;

    @Column(name = "to_currency", nullable = false, length = 3)
    private String to;

    @Column(name = "conversion_factor", nullable = false)
    private BigDecimal conversionFactor;

    @Transient
    private BigDecimal convertedValue;
    @Transient
    private String environment;

    public Cambio() {

    }

    public Cambio(Long id, String form, String to, BigDecimal conversionFactor, BigDecimal convertedValue, String environment) {
        this.id = id;
        this.form = form;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.convertedValue = convertedValue;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cambio cambio = (Cambio) o;
        return Objects.equals(id, cambio.id) && Objects.equals(form, cambio.form) && Objects.equals(to, cambio.to) && Objects.equals(conversionFactor, cambio.conversionFactor) && Objects.equals(convertedValue, cambio.convertedValue) && Objects.equals(environment, cambio.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, form, to, conversionFactor, convertedValue, environment);
    }
}
