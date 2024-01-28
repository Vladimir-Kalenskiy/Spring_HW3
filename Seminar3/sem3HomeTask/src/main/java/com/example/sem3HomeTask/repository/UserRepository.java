package com.example.sem3HomeTask.repository;

import com.example.sem3HomeTask.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторий работы с БД
 */
@Component
public class UserRepository {

    /**
     * Создание нового списка пользователей
     */
    private List<User> users = new ArrayList<>();

    /**
     * Метод получения списка пользователей
     * @return список пользователей
     */
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
