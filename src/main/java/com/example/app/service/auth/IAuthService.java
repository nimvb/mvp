package com.example.app.service.auth;

import com.example.app.model.generic.Credential;
import com.example.app.service.core.IService;

public interface IAuthService extends IService {

    boolean authenticate(Credential credential);
}
