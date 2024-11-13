package com.workintech.springauthenticationauthorization.repository;

import com.workintech.springauthenticationauthorization.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {

    @Query("SELECT u FROM ApplicationUser u WHERE u.email = :email")
    Optional<ApplicationUser> findUserByEmail(String email);

//    @Query(value = "SELECT p.id, p.name, p.price FROM selectProductsWithPrice(:price) as p", nativeQuery = true)
//    List<Products> findProductByPrice(double price);
}
