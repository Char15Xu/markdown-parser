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
    public void MarkdownParseTest1() throws IOException{
        assertEquals(List.of("https://something.com","some-page.html"), 
        MarkdownParse.getLinks(Files.readString(Path.of("failtest1.md"))));
    }

    @Test
    public void MarkdownParseTest2() throws IOException{
        assertEquals(List.of(""), 
        MarkdownParse.getLinks(Files.readString(Path.of("failtest2.md"))));
    }


    @Test
    public void MarkdownParseTest3() throws IOException{
        assertEquals(List.of(""), 
        MarkdownParse.getLinks(Files.readString(Path.of("failtest3.md"))));
    }
}