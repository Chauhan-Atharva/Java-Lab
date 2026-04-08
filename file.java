import java.io.*;
import java.util.Scanner;
public class twentytwo {
public static void convertToUpperCase(String filePath) {
    
File fileToBeModified = new File(filePath);
String oldContent = "";
BufferedReader reader = null;
FileWriter writer = null;
try {
reader = new BufferedReader(new FileReader(fileToBeModified));
String line = reader.readLine();
while (line != null) {
oldContent = oldContent + line + System.lineSeparator();
line = reader.readLine();}
System.out.println("Original Content of the file: " + oldContent);
String newContent = oldContent.toUpperCase();
writer = new FileWriter(fileToBeModified);
writer.write(newContent);
System.out.println("New content of the file: " + newContent);
} catch (IOException e) {
System.out.println("IOException caught");
} finally {
try {
if (reader != null)
reader.close();
if (writer != null)
writer.close();
} catch (IOException e) {
System.out.println("Error while closing resources");}}}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the file path:");
String filePath = sc.nextLine();
convertToUpperCase(filePath);
sc.close();}}
