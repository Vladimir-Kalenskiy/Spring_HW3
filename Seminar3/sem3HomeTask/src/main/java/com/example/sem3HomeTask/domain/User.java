package com.example.sem3HomeTask.domain;


/**
 * Обьект пользователь.
 */
public class User {

    /**
     * Имя пользователя
     */
    private String name;

    /**
     * Возраст пользователя
     */
    private int age;
    /**
     * Почтовый адрес пользователя
     */
    private String email;

    /**
     * Геттеры и сетторы
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
