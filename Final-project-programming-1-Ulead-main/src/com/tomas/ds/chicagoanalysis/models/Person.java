package com.tomas.ds.chicagoanalysis.models;

/**
 *
 * @author Gaboelc
 */
public class Person {
    
    protected String name;
    protected String lastname;
    
    /**
     * 
     * @param name
     * @param lastname 
     */

    public Person(final String name, final String lastname) {
        
        this.name = name.replace("\"", "").replace(" ", "");
        this.lastname = lastname.replace("\"", "");
        
    }
    
    public String toString(){
        return "{\"name\":\"" + this.name + "\", \"lastname\":\"" + this.lastname + "\"}";
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
