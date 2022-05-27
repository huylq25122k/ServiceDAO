package DAOPackage;

import DAOPackage.model.Repositoryy;
import ServicePackage.IUserService;
import ServicePackage.UserServiceDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DAOImpl implements IUserService {

    private Repositoryy Repository;

    public DAOImpl(Repositoryy repository) {
        Repository = repository;
    }

    @Override
    public List<UserServiceDTO> getAll() {
        return null;
    }
}
