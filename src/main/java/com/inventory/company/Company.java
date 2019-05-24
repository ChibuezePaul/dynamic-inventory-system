package com.inventory.company;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class Company {
    private String coyLogo;
    private String footerText;
    private String coyDecsription;
    private Timestamp coyCode;
}
