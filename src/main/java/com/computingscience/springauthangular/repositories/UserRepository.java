/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computingscience.springauthangular.repositories;

import com.computingscience.springauthangular.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author misaf
 */
public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
