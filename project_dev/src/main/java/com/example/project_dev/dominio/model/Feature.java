package com.example.project_dev.dominio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_feature")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Feature extends BaseItem {

}
