package com.gigmanager.gigmanager.Repository;

import com.gigmanager.gigmanager.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository<T, ID> extends CrudRepository<User, Long> {
    User save(User user);

    Optional<User> findById(Long id);

    void deleteById(Long id);

}
