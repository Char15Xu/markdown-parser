//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        if (markdown.contains("[") == true && markdown.contains("]") == true && markdown.contains("(") == true && markdown.contains(")") == true) {
            while(currentIndex < markdown.length()) {
                int openBracket = markdown.indexOf("[", currentIndex);
                int closeBracket = markdown.indexOf("]", openBracket);
                int openParen = markdown.indexOf("(", closeBracket);
                int closeParen = markdown.indexOf(")", openParen);
                toReturn.add(markdown.substring(openParen + 1, closeParen));
                currentIndex = closeParen + 1;  
            }
        }
        // If the link does not have brackets
        else if (markdown.contains("(") == true && markdown.contains(")") == true) {
            while(currentIndex < markdown.length()) {
                int firstParen = markdown.indexOf("(", currentIndex);
                int secondParen = markdown.indexOf(")", firstParen);
                toReturn.add(markdown.substring(firstParen + 1, secondParen));
                currentIndex = secondParen + 1;
            }
        } 
        // To account for files with no links in them
        else {
            toReturn.add("A link was not found in this file.");
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
