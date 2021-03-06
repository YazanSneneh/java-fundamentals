/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path path = Paths.get("gates.js"); // to open file that i want to read

        try {
            List<String> lines = Files.readAllLines(path);

            for(int i=0; i<lines.size(); i++){
                if(lines.get(i).isEmpty()){
                    continue;
                }else if(lines.get(i).contains("{")){
                    continue;
                }else if(lines.get(i).contains("}")){
                    continue;
                }else if(lines.get(i).contains("else")){
                    continue;
                }
                else if(lines.get(i).contains("if")){
                    continue;
                }
                else{
                    System.out.println("Line "+ (i+1)+ ": Missing semicolon.");
                }
//     System.out.println(line);
           }
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}