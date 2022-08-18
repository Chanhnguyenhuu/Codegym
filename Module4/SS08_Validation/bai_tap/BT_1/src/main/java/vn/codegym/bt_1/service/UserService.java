package vn.codegym.bt_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.bt_1.repository.IUserRepository;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository;
}
