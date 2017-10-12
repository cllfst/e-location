package com.cllfst.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


/**
 * Description of the file User.java <br>
 *
 * @author ahmed ksentini
 * <p>
 * It represents the user of the application <br>
 * <p>
 * This notice should not be removed <br>
 */
@Entity
@Table(name = "annonce")
public class Annonce implements Serializable {

        @Id
        @GeneratedValue
        @Column(name="id_ad")
        private Long idAd;

        @Column(name="titre_ad")
        private String titreAd;

        @Column(name="region")
        private String region;


        @Column(name="city")
        private String city;

        @Column(name="description")
        private String description;

        @Column(name="prix")
        private int prix;

        @Column(name="id_user")
        private Long idUser;

    public Annonce() {
        super();
    }
    public Annonce(String titreAd, String region, String city, String description, int prix, Long idUser) {
        this.titreAd = titreAd;
        this.region = region;
        this.city = city;
        this.description = description;
        this.prix = prix;
        this.idUser = idUser;
    }

    public Long getIdAd() {
        return idAd;
    }

    public void setIdAd(Long idAd) {
        this.idAd = idAd;
    }

    public String getTitreAd() {
        return titreAd;
    }

    public void setTitreAd(String titreAd) {
        this.titreAd = titreAd;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
