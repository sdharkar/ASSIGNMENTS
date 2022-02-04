package java11Features;
import java.io.*;
import java.util.Scanner;

public class Q4 {
public static void main(String[] args) throws IOException {
// File path is passed as parameter
File file = new File("E:\\8th sem\\internship\\Core Java\\String Assignment\\Java11Assignments_StudentList.txt");

Scanner sc = new Scanner(file);

int count = 0;
while (sc.hasNextLine()){
String string = sc.nextLine();

if(string.length()!=0){
System.out.println(string.trim());
count++;
            }
        }
System.out.println("Total number of students present in the txt file are: "+count);

sc.close();
    }
}
