package com.bcefit.epita.session7.immutable;

public class User {
    private final String firstname ; //final :  champs obligatoire non modifiable
    private final String lastname ;

    private int age ;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    protected User clone(String fixedFirstName, String fixedLastName) throws CloneNotSupportedException {
        User u = new User(fixedFirstName, fixedLastName) ;
        return u;
    }

    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age ;
    }


    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = 0 ;
    }



}
