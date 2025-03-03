package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Artcostohist implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "ARTICULO", length = 20, nullable = false)
    @JsonView
    String articulo;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a", timezone = "America/El_Salvador")
    @Column(name = "FECHA", nullable = true)
    @JsonView
    Date fecha;

    @Column(name = "COSTOANTERIOR", scale = 8, precision = 38, nullable = true)
    @JsonView
    BigDecimal costoanterior;

    @Column(name = "COSTOACTUAL", scale = 8, precision = 38, nullable = true)
    @JsonView
    BigDecimal costoactual;

    @Column(name = "COSTOPROMEDIO", scale = 8, precision = 38, nullable = true)
    @JsonView
    BigDecimal costopromedio;

    @Column(name = "MOV", length = 50, nullable = true)
    @JsonView
    String mov;

    @Column(name = "MOVID", length = 50, nullable = true)
    @JsonView
    String movid;

    @Column(name = "MODULO", length = 20, nullable = true)
    @JsonView
    String modulo;

}
