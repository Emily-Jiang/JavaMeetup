package com.example.talk.graphql.db;

@SuppressWarnings("serial")
public class DuplicateSuperHeroException extends Exception {

    public DuplicateSuperHeroException(String message) {
        super(message);
    }
}
