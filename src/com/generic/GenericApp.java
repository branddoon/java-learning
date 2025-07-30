package com.generic;

import com.generic.impl.GenericWildcard;

public class GenericApp {
    public static void main(String [] args){
        System.out.println("1. Generic wildcard");
        GenericWildcard genericWildcard = new GenericWildcard();
        genericWildcard.execute();
    }
}
