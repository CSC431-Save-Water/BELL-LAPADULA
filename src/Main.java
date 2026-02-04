
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import models.BaseModel;
import models.MissionSpecModel;
import models.SecurityLevel;
import models.User;
import models.WeaponsSpecModel;

public class Main {

    // This map contains all objects linked with their UUIDs
    public static Map<UUID, BaseModel> objectMap = new HashMap<>();

    // This map contains all users linked with their UUIDS
    public static Map<UUID, User> userMap = new HashMap<>();
    
    public static void main(String[] args) {

        // Initialize Users for Simulation
        User valentine = new User("Valentine", "Davis", SecurityLevel.UNCLASSIFIED);
        User robby = new User("Robert", "Yestur", SecurityLevel.CONFIDENTIAL);
        User brandon = new User("Brandon", "Lee", SecurityLevel.SECRET);
        User pauline = new User("Pauline", "Pugh", SecurityLevel.TOP_SECRET);

        // Add Users to userMap
        userMap.put(valentine.getUserUUID(), valentine);
        userMap.put(robby.getUserUUID(), robby);
        userMap.put(brandon.getUserUUID(), brandon);
        userMap.put(pauline.getUserUUID(), pauline);

        // Initialize Objects for Simulation
        MissionSpecModel ash = new MissionSpecModel("Ash", SecurityLevel.TOP_SECRET);
        MissionSpecModel woods = new MissionSpecModel("Woods", SecurityLevel.CONFIDENTIAL);

        WeaponsSpecModel miracle = new WeaponsSpecModel("Miracle", SecurityLevel.SECRET);
        WeaponsSpecModel bombastic = new WeaponsSpecModel("Bombastic Side Eye", SecurityLevel.UNCLASSIFIED);

        // Add Objects to objectMap
        objectMap.put(ash.getId(), ash);
        objectMap.put(woods.getId(), woods);
        objectMap.put(miracle.getId(), miracle);
        objectMap.put(bombastic.getId(), bombastic);
        
        System.out.println("Users: ");
        for (User u : userMap.values()) {
            System.out.println(u.getFullName() + "\t" + u.getUserUUID() + "\t" + u.getUserSecurityLevel().getLevelName());
        }

        System.out.println("\n\nObjects: ");
        for (BaseModel obj : objectMap.values()) {
            System.out.println(obj.getObjectApiName() + "\t" + obj.getId() + "\t" + obj.getObjectSecurityLevel().getLevelName());
        }
    }
}
