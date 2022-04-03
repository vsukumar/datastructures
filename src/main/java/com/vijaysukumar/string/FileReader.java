package com.vijaysukumar.string;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileReader {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/vijaysukumar/projects/datastructures/file.txt");

        BufferedReader bufferedReader = Files.newBufferedReader(path);

        String numberOfElements = bufferedReader.readLine();

        int[] integers = new int[Integer.parseInt(numberOfElements)];

        String nextLine = bufferedReader.readLine();

        String[] strings = nextLine.split(" ");

        for( int i =0;i< strings.length; i++ ) {
            System.out.println(strings[i]);
        }
    }
}
