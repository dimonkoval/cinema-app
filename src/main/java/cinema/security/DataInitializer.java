package cinema.security;

import cinema.model.Role;
import cinema.model.RoleName;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleName.ADMIN);
        Role userRole = new Role();
        userRole.setRoleName(RoleName.USER);
        User user = new User();
        user.setEmail("admin@gmail.com");
        user.setPassword("admin");
        user.setRoles(Set.of(adminRole));
    }
}
