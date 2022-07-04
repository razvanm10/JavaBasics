package org.example;

public class Person {

    private Long id;

    private String name;

    public Person(Long idValue, String nameValue) {
        this.id = idValue;
        this.name = nameValue;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
