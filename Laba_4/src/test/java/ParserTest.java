import beans.Person;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ParserTest {

    @org.junit.jupiter.api.Test
    void getPersonList_ShouldThrowNullPointerException_WhenPathIsNull() {
        Parser parser = new Parser();
        String path = null;

        
        assertThrows(NullPointerException.class, () -> {
            parser.getPersonList(path);
        });
    }

    @org.junit.jupiter.api.Test
    void print_ShouldPrintPersonList_WhenListIsNotEmpty() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Parser parser = new Parser();
        File file = new Main.GetFile().getFileFromResources("foreign_names.csv");
        String path = String.valueOf(file);
        List<Person> list = parser.getPersonList(path);
        parser.print(list);

        
        StringBuilder expectedOutput = new StringBuilder();
        for (Person person : list) {
            expectedOutput.append(person.toString()).append("\n");
        }

        
        assertEquals(expectedOutput.toString(), outContent.toString().trim());
    }
}
