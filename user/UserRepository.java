package user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<Libraryvisitor> libraryvisitors = new ArrayList<>();

    public Libraryvisitor getUser(String name) {
        return libraryvisitors.stream()
                .filter(libraryvisitor -> name.equals(libraryvisitor.getName()))
                .findFirst()
                .orElse(null);
    }

    public List<Libraryvisitor> getAllUsers() {
        return libraryvisitors;
    }



    public void addUser(Libraryvisitor visitor) {
        if(visitor == null) {
            return;
        }
        libraryvisitors.add(visitor);
    }

}
