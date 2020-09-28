
import user.UserService;

public class Starter {

    public static void main(String[] args) {
        LibraryService.getInstance().readBooks();
        UserService.getInstance().goToStartMenu();
    }



}