import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;



public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void MarkdownParse() throws IOException{
        //assertEquals(List.of(""), 
        //MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
        





        
        
       // assertEquals(List.of("https://something.com","some-thing.html"), 
        // MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));

        assertEquals(List.of("https://something.com","some-page.html"), 
        MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));

        /*
        assertEquals(List.of("page.com"), 
        MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
        assertEquals(List.of("page.com"), 
        MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
        assertEquals(List.of(""), 
        MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
        assertEquals(List.of(""), 
        MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
        */
    }
}