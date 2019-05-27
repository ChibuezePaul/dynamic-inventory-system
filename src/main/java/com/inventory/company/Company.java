package com.inventory.company;

import com.inventory.CommonFields;

import javax.persistence.Entity;

@Entity
public class Company extends CommonFields {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer active = 1;
	private String coyLogo;
    private String footerText;
    private String coyDescription;
    private String coyCode = "COY"+System.currentTimeMillis();

    public Company(Integer active, String coyLogo, String footerText, String coyDescription, String coyCode) {
        this.active = active;
        this.coyLogo = coyLogo;
        this.footerText = footerText;
        this.coyDescription = coyDescription;
        this.coyCode = coyCode;
    }

    public Company() {
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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

    public String getCoyDescription() {
        return coyDescription;
    }

    public void setCoyDescription(String coyDescription) {
        this.coyDescription = coyDescription;
    }

    public String getCoyCode() {
        return coyCode;
    }

    public void setCoyCode(String coyCode) {
        this.coyCode = coyCode;
    }

    @Override
    public String toString() {
        return "Company{" +
                "active=" + active +
                ", coyLogo='" + coyLogo + '\'' +
                ", footerText='" + footerText + '\'' +
                ", coyDescription='" + coyDescription + '\'' +
                ", coyCode='" + coyCode + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateModified=" + dateModified +
                '}';
    }
}
