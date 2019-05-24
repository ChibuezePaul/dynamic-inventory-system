package com.inventory.company;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class Company {
    private String coyLogo;
    private String footerText;
    private String coyDecsription;
    private Timestamp coyCode;

    public Company(String coyLogo, String footerText, String coyDecsription, Timestamp coyCode) {
        this.coyLogo = coyLogo;
        this.footerText = footerText;
        this.coyDecsription = coyDecsription;
        this.coyCode = coyCode;
    }

    public Company() {
    }

    public String getCoyLogo() {
        return coyLogo;
    }

    public void setCoyLogo(String coyLogo) {
        this.coyLogo = coyLogo;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getCoyDecsription() {
        return coyDecsription;
    }

    public void setCoyDecsription(String coyDecsription) {
        this.coyDecsription = coyDecsription;
    }

    public Timestamp getCoyCode() {
        return coyCode;
    }

    public void setCoyCode(Timestamp coyCode) {
        this.coyCode = coyCode;
    }
}
