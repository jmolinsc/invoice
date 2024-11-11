package com.app.invoice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
public class Concepto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "MODULO", length = 20, nullable = false)
    @JsonView
    String modulo;

    @Column(name = "CUENTA", length = 20, nullable = true)
    @JsonView
    String cuenta;

    @Column(name = "CONCEPTO", length = 50, nullable = false)
    @JsonView
    String concepto;

    @Column(name = "IDDINERO", length = 18, nullable = true)
    @JsonView
    Integer iddinero;

    @Column(name = "IDCXP", length = 18, nullable = true)
    @JsonView
    Integer idcxp;

//    @OneToMany(mappedBy = "concepto", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
//    @JsonIgnore
//    List<Venta> ventas;

}
