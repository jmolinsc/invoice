package com.app.invoice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

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
public class Ctecat implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @JsonView
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Integer id;

    @Column(name = "CATEGORIA",length =50, nullable = true)
    @JsonView
    String categoria;

}

