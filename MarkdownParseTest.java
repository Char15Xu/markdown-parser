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

    @Test
    public void Snippet1Test() throws IOException {
        Path fileName = Path.of("Snippet1.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("google.com"));
    }

    @Test
    public void Snippet2Test() throws IOException {
        Path fileName = Path.of("Snippet2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("a.com", "a.html","example.com"));
    }

    @Test
    public void Snippet3Test() throws IOException {
        Path fileName = Path.of("Snippet3.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"));
    }

}