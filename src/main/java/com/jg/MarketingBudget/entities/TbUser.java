package com.jg.MarketingBudget.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_USERS")
public class TbUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "us_id", nullable = false, unique = true)
    private int id;
    @Column(name = "us_f_name", length = 25)
    private String fname;
    @Column(name = "us_l_name", length = 25)
    private String lname;
    @Column(name = "us_email", nullable = false, unique = true, length = 45)
    private String email;
    @Column(name = "us_password", nullable = false, length = 25)
    private String password;

}