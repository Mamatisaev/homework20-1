package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fileWriter("Alphabet and Numbers.txt");
        fileReader("Alphabet and Numbers.txt");
    }

    public static void fileWriter(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (char i = 'A'; i <= 'Z'; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    if ((j - i) == 32)
                        fileWriter.write(i + " " + j + "\n");
                }
            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i + "\n");
            }
        } catch (IOException d) {
            d.printStackTrace();
        }
    }

    public static void fileReader(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);
            int count = 1;
            while (scanner.hasNextLine()) {
                System.out.println(count + ": " + scanner.nextLine());
                count++;
            }
        } catch (IOException d) {
            d.printStackTrace();
        }
    }
}