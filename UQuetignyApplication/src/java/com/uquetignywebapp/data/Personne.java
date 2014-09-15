/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uquetignywebapp.data;

import com.mongodb.DBObject;

/**
 *
 * @author Yacine
 */
public abstract class Personne implements DBObject{

    public String idPersonne;
    public String type;
    public String nomPersonne;
    public String prenomPersonne;
    public String titrePersonne;
    public String adressePersonne;
    public String telephonePersonne;
    public String codePostalPersonne;
    public String compInfoPersonne;
    public String compSecretPersonne;

    public Personne() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }

    public String getTitrePersonne() {
        return titrePersonne;
    }

    public void setTitrePersonne(String titrePersonne) {
        this.titrePersonne = titrePersonne;
    }

    public String getAdressePersonne() {
        return adressePersonne;
    }

    public void setAdressePersonne(String adressePersonne) {
        this.adressePersonne = adressePersonne;
    }

    public String getTelephonePersonne() {
        return telephonePersonne;
    }

    public void setTelephonePersonne(String telephonePersonne) {
        this.telephonePersonne = telephonePersonne;
    }

    public String getCodePostalPersonne() {
        return codePostalPersonne;
    }

    public void setCodePostalPersonne(String codePostalPersonne) {
        this.codePostalPersonne = codePostalPersonne;
    }

    public String getCompInfoPersonne() {
        return compInfoPersonne;
    }

    public void setCompInfoPersonne(String compInfoPersonne) {
        this.compInfoPersonne = compInfoPersonne;
    }

    public String getCompSecretPersonne() {
        return compSecretPersonne;
    }

    public void setCompSecretPersonne(String compSecretPersonne) {
        this.compSecretPersonne = compSecretPersonne;
    }

}
