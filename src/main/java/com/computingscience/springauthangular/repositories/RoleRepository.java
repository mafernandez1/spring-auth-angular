/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computingscience.springauthangular.repositories;

import com.computingscience.springauthangular.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author misaf
 */
public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
