package com.usermanagement.runtime.service;

import com.usermanagement.domain.dto.LoginRequest;
import com.usermanagement.domain.service.UserService;
import org.springframework.http.ResponseEntity;

public class UserConfigImpl implements UserService {
    @Override
    public ResponseEntity<?> login(LoginRequest loginRequest) {
        return null;
    }
}
