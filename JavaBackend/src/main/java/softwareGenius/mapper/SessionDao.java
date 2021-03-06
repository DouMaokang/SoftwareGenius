package softwareGenius.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import softwareGenius.model.Session;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * Used to interact with session database
 */
@Mapper
@Component
public interface SessionDao {
    /**
     * Add session to the database
     * @param userId the id of the user
     * @param loginTime the time user logged in
     * @param logoutTime the time user logged out
     */
    Boolean addSession(@Param("userId") Integer userId, @Param("loginTime") Timestamp loginTime, @Param("logoutTime") Timestamp logoutTime);
    /**
     * Update session to the database
     * @param sessionId the id of the session to be added
     * @param logoutTime the time user logged out
     */
    Boolean updateSessionEndTime(@Param("sessionId") Integer sessionId, @Param("logoutTime") LocalDateTime logoutTime);
    /**
     * Get the session according to Id
     * @param userId the id of the user
     */
    List<Session> getSessionByUserID(@Param("userId") Integer userId);

    /**
     * Get all session records in the database
     */
    List<Session> getAllSession();
}
