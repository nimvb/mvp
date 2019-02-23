package com.example.app.service.auth;

import com.example.app.model.generic.Credential;

public class AuthService implements IAuthService {
    @Override
    public boolean authenticate(Credential credential) {
        return credential.getUsername().equals("admin") && credential.getPassword().equals("123456");
    }
}
