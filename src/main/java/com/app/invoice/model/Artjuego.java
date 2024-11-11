package com.app.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Artjuego implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @Column(name = "IDLINEA", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idlinea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "ARTICULO", referencedColumnName = "ARTICULO")
    Art art;

    @Column(name = "ORDEN", nullable = true)
    @JsonView
    Integer orden;

    @Column(name = "CANTIDAD", scale = 8, precision = 18, nullable = true)
    @JsonView
    BigDecimal cantidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JsonView
    @JoinColumn(name = "ARTICULOJ", referencedColumnName = "ARTICULO")
    Art articuloj;

}
