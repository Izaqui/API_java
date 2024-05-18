package com.example.project_dev.dominio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_account")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    @Column(unique = true, nullable = false, length = 20)
    private String number;

    @NotBlank
    @Size(max = 10)
    @Column(nullable = false, length = 10)
    private String agency;

    @NotNull
    @Column(precision = 13, scale = 2, nullable = false)
    private BigDecimal balance;

    @NotNull
    @Column(name = "additional_limit", precision = 13, scale = 2, nullable = false)
    private BigDecimal limit;

}
