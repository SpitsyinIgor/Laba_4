import au.com.bytecode.opencsv.CSVReader;
import ru.vsu.beans.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    static List<Person> getPersonList(String path) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(path), ';');
        if (reader == null) {
            throw new FileNotFoundException(path);
        }
        List<Person> people = new ArrayList<>();
        String[] nextLine = reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                people.add(new Person(Integer.parseInt(nextLine[0]), nextLine[1], nextLine[2], Integer.parseInt(nextLine[5]), nextLine[3], getDepartmentID(nextLine[4], people), nextLine[4]));
            }
        }
        return people;
    }

    static void print(List<Person> list) {
        for (Person i : list) {
            System.out.println(i.toString());
        }
    }


    
}
