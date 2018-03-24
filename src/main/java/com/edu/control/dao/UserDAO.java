package com.edu.control.dao;

import com.edu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    User getUserByUsername(String username);

    User getUserByEmail(String email);

    User getUserByNfcTag(String nfcTag);

}
