package com.priyam.learnJava.repository;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoConnection {

  public static Datastore getDatastore() {
    final Morphia morphia = new Morphia();
    final MongoClient client = new MongoClient();
    return morphia.createDatastore(client, "learnJava");
  }
}
