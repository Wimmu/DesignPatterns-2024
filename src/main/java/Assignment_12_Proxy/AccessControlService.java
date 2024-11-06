package Assignment_12_Proxy;

import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private Set<String> accessRights;

    private AccessControlService() {
        accessRights = new HashSet<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess(String documentId, String username) {
        accessRights.add(documentId + ":" + username);
    }

    public boolean isAllowed(String documentId, String username) {
        return accessRights.contains(documentId + ":" + username);
    }
}
