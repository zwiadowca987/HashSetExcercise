package com.company;

class Person {
    private int id;
    private String name;
    private String surname;

    Person() {
        id = 0;
        name = "";
        surname = "";
    }

    int getID() {
        return id;
    }

    void setID(int ID) {
        this.id = ID;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

//    public boolean equals(Object o1, Object o2) {
//        return o1.getID() == o2.getID() && o1.getName() == o2.getName() && o1.getSurname() == o2.getSurname();
//    }
}
