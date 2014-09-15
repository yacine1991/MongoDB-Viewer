package com.uquetignywebapp.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yacine
 */
public class Collection {

    private List<String> listOfClasses;
    private String collectionName;
    public Collection() {
        listOfClasses = new ArrayList<String>();
    }

    public Collection(List<String> listCollection) {
        this.listOfClasses = listCollection;
    }

    public int size() {
        return listOfClasses.size();
    }

    public String getNameOfClassAtIndex(int index) {
        String nomClasse = listOfClasses.get(index).toString();
        return nomClasse;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public List<String> getListOfClasses() {
        return listOfClasses;
    }

    public void setListOfClasses(List<String> listOfClasses) {
        this.listOfClasses = listOfClasses;
    }

}
