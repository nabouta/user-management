package com.usermanagement.domain.service;

import com.usermanagement.domain.dto.LoginRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> login(LoginRequest loginRequest);

}
