package ServicePackage;

import java.util.List;

public class UserService {

    public UserService() {

    }

    private IUserService iUserService;

    public UserService(IUserService userDAO) {
        this.iUserService = userDAO;
    }

    public List<UserServiceDTO> getAllUser() {
        return iUserService.getAll();
    }

}
