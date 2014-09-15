package com.uquetignyadminapp.connection;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yacine
 */
public class ConnectionMongoDB {

    DB db = null;

    public ConnectionMongoDB() throws UnknownHostException {
        Mongo mongoClient = new Mongo("localhost");
        db = mongoClient.getDB("test");
        //boolean auth = db.authenticate(myUserName, myPassword);

    }

    public DB getDB() {
        return db;
    }

    public void supprimerTable(String table) {
        DBCollection col = getRecordsOfSpecificCollection(table);
        DBCursor cursor = col.find();
        while (cursor.hasNext()) {
            col.remove(cursor.next());
        }
        col.drop();

    }

    public ArrayList<String> getAllClassOfDb() {
        ArrayList<String> list = new ArrayList<String>(db.getCollectionNames());
        //  System.out.println("Taille DB " +list.size());
        return list;
    }

    public String getCollectionName() {
        return db.getName();
    }

    public DBCollection getRecordsOfSpecificCollection(String collectionName) {
        DBCollection coll = db.getCollection(collectionName);
        return coll;

    }
}
