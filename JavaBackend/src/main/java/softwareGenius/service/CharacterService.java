package softwareGenius.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softwareGenius.mapper.CharacterDao;
import softwareGenius.mapper.UserDao;
import softwareGenius.model.Category;
import softwareGenius.model.Character;
import softwareGenius.model.User;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterDao characterDao;
    private final UserDao userDao;

    @Autowired
    public CharacterService(CharacterDao characterDao, UserDao userDao) {
        this.characterDao = characterDao;
        this.userDao = userDao;
    }

    /**
     * Initiate a new character with given character object
     * @param character character object
     * @return id of the character
     */
    public Integer initNewCharacter(Character character) {
        return characterDao.addCharacter(character);
    }

    /**
     * Initiate a new character with associated world with given character object
     * @param userId id of user
     * @param charName name of the character
     * @return id of the character
     */

    public Integer initNewCharacter(Integer userId, Category charName) {
        Integer exp = 0, level = 0, attackPt = 10, correctQueNo = 0, totalQuesNo = 0;
        Character character = new Character(userId, charName, exp, level, attackPt, correctQueNo, totalQuesNo);
        characterDao.addCharacter(character);
        return character.getCharId();
    }

    /**
     * update the exp, attack points, level, and other fields of the character object and
     * the overall experience points of the user object with given userId and updatedCharacter object
     * @param updatedCharacter updated character object
     * @return status of the request (ex. True if succeed)
     */
    public Boolean updateCharacter(Character updatedCharacter) {
        // Get the old character data by the id of the new Character
        Character oldCharacter =  characterDao.getCharacterByCharId(updatedCharacter.getCharId());

        // Calculate the difference of experience points between the old and new character
        int expDiff = updatedCharacter.getExp() - oldCharacter.getExp();

        // Get the old User with the given userId
        User oldUser = userDao.getUserById(updatedCharacter.getUserId());


        // Get the previous overall experience points of the old user
        Integer prevExp = oldUser.getOverallExp();

        // Reset the overall Experience points
        oldUser.setOverallExp(prevExp + expDiff);

        // Update the user
        userDao.updateUser(oldUser);

        // Update the character
        return characterDao.updateCharacter(updatedCharacter);
    }

    /**
     * Get Character by the given userId
     * @param userId id of the user
     * @return list of Character objects
     */
    public List<Character> getCharacterByUserId(Integer userId) {
        return characterDao.getCharacterByUserId(userId);
    }

    /**
     * Get Character by given charId
     * @param charId id of the character
     * @return a character object with matching charId
     */
    public Character getCharacterByCharId(Integer charId) { System.out.println(charId);return characterDao.getCharacterByCharId(charId); }

    /**
     * Get all characters
     * @return a list of all character objects
     */
    public List<Character> getAll() {
        return characterDao.getAll();
    }

    /**
     * Delete character with the given userId
     * @param userId id of the user
     * @return status of the request (ex. True if succeed)
     */
    public Boolean deleteCharacter(Integer userId) {
        return characterDao.deleteCharacter(userId);
    }

}
