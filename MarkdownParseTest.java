import static org.junit.Assert.*; 
import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest { // Create the class
    @Test // tell the code we're making a test here 
    public void addition() { // the test method
        assertEquals(2, 1 + 1); // check to see if 2 equals 1+1 and the test passes if it is
    }
    @Test
    public void getLinksTest() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", "some-thing.html"));
    }



public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void MarkdownParseTest1() throws IOException{
        assertEquals(List.of("https://something.com","some-page.html"), 
        MarkdownParse.getLinks(Files.readString(Path.of("failtest1.md"))));
    }

    @Test
    public void MarkdownParseTest2() throws IOException{
        assertEquals(new ArrayList<String>(), 
        MarkdownParse.getLinks(Files.readString(Path.of("failtest2.md"))));
    }


    @Test
    public void MarkdownParseTest3() throws IOException{
        assertEquals(new ArrayList<String>(), 
        MarkdownParse.getLinks(Files.readString(Path.of("failtest3.md"))));
    }
}