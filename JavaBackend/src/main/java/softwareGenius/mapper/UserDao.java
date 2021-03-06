package softwareGenius.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import softwareGenius.model.User;

import java.util.List;

@Mapper
@Component
public interface UserDao {
    /**
     * Insert new User object to the database
     * @param user User object
     * @return id of the user
     */
    Integer addUser(User user);

    /**
     * Fetch the user object with matching userId
     * @param userId unique id of the user
     * @return User object
     */
    User getUserById(Integer userId);

    /**
     * Fetch the user object with matching email address
     * @param email unique email of the user
     * @return User object
     */
    User getUserByEmail(String email);

    /**
     * Get all users
     * @return List of User objects
     */
    List<User> getAll();
    /**
     * Get all non admin users
     * @return List of non Admin User objects
     */
    List<User> getAllNonAdmin();

    /**
     * Delete the user with matching userId
     * @param userId unique id the user
     * @return status of the query (ex. True if query succeed)
     */
    Boolean deleteUser(Integer userId);

    /**
     * Update the User object with the given new user
     * @param user new user obejct with updated fields
     * @return status of the query (ex. True if query succeed)
     */
    Boolean updateUser(User user);
}