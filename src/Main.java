import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

/**
 * @author Виктория и Ксения
 * @version
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Виктория\\Desktop\\foreign_names.csv";
        Reader reader = new Reader();
        System.out.println("---------Result------------" + reader.reader(path));
    }
}

