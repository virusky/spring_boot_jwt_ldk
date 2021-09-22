package iuh.edu.vn.spring_boot_jwt_ldk.service;

import iuh.edu.vn.spring_boot_jwt_ldk.authen.UserPrincipal;
import iuh.edu.vn.spring_boot_jwt_ldk.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
