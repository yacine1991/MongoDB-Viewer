/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uquetignywebapp.data;

import java.util.ArrayList;

/**
 *
 * @author Yacine
 */
public class ListePersonne {

    private final ArrayList<Personne> listeDesPersonnes;

    public ListePersonne() {
        listeDesPersonnes = new ArrayList<Personne>();
    }

    public ArrayList<Personne> getListeDesPersonnes() {
        return listeDesPersonnes;
    }
    
}
