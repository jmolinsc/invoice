package com.app.invoice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

public class Movflujo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "DMOVID", length = 20, nullable = false)
    @JsonView
    String dmovid;

    @Column(name = "DMOV", length = 20, nullable = false)
    @JsonView
    String dmov;

    @Column(name = "OID", nullable = true)
    @JsonView
    Integer oid;

    @Column(name = "CANCELADO", nullable = false)
    @JsonView
    Integer cancelado;

    @Column(name = "OMOVID", length = 20, nullable = true)
    @JsonView
    String omovid;

    @Column(name = "DID", nullable = true)
    @JsonView
    Integer did;

    @Column(name = "DMODULO", length = 20, nullable = true)
    @JsonView
    String dmodulo;

    @Column(name = "OMOV", length = 20, nullable = true)
    @JsonView
    String omov;

    @Column(name = "OMODULO", length = 20, nullable = true)
    @JsonView
    String omodulo;

}
