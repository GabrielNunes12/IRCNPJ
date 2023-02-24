package com.ircnpj.demo.Models;

import com.ircnpj.demo.Config.ConfigApp;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tb_user", schema = ConfigApp.SCHEMA_USER)
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String cnpj;

  private BigDecimal salary;

  private String occupation;
}
