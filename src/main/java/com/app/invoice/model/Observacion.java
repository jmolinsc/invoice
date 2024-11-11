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
public class Observacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "ID", nullable = true)
    @JsonView
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "MODULO", length = 20, nullable = false)
    @JsonView
    String modulo;

    @Column(name = "OBSERVACION", length = 255, nullable = false)
    @JsonView
    String observacion;
}
