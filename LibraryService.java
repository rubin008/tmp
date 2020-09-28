import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class LibraryService {
    private List<Kniga> books = new ArrayList<Kniga>();
    private static LibraryService instance;
    private Properties properties;

    private LibraryService(){
        this.properties = new Properties();
    }

    public void readBooks1() {
        Properties props = readProperties();
        List<String> names = getNames();
        List<String> authors = getAuthors();
        List<String> pages = getNames();
        for (int i = 0; i < names.size(); i++) {

        }

        


    }

    public List<String> getNames() {
        String nicksStr = properties.getProperty("books.name");
        return Arrays.asList(nicksStr.split(","));
    }
    public List<String> getAuthors() {
        String nicksStr = properties.getProperty("books.name");
        return Arrays.asList(nicksStr.split(","));
    }

    private Properties readProperties() {
        try (InputStream input = new FileInputStream("/books.properties")) {
            properties.load(input);
        } catch (IOException e) {
            System.out.println("Couldn't read settings");
        }
        return properties;
    }


    public void readBooks() {
        books.add(new Kniga("1", "Odyssey", "Homer", "Springer", 1990, 500, 332, false));
        books.add(new Kniga("2", "Iliada", "Homer", "Springer", 1990, 500, 332, false));
        books.add(new Kniga("3", "Mathematics", "Sobolev", "Elsevier", 1966, 400, 112, false));
        Kniga tmp3 = new Kniga("4", "Physics", "Ivanov", "Nauka", 1954, 460, 32, false);
        books.add(tmp3);
        Kniga tmp4 = new Kniga("5", "Contemporary Art", "Golder", "Zimmer Publisher", 2019, 150, 75, false);
        books.add(tmp4);
        Kniga tmp5 = new Kniga("6", "Fairy Tails", "Timberlace", "Gold Publishing", 1982, 110, 42, false);
        books.add(tmp5);
        System.out.println("Full List of Books:");
        books.forEach(System.out::println);
    }

    public static LibraryService getInstance() {
        if (instance == null) {
            instance = new LibraryService();
        }
        return instance;
    }

}
