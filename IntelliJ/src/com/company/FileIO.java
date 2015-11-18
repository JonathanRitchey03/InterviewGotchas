package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
//    public static int fileLineCount(String path) throws IOException {
//        FileReader fr = new FileReader(path);
//        BufferedReader textReader = new BufferedReader(fr);
//        int lineCount = 0;
//        while ( textReader.readLine() != null) {
//            lineCount++;
//        }
//        textReader.close();
//        return lineCount;
//    }
//    public static String[] linesInFile(String path) throws IOException {
//        int lineCount = fileLineCount(path);
//        if ( lineCount > 0 ) {
//            String line[] = new String[lineCount];
//            FileReader fr = new FileReader(path);
//            BufferedReader bf = new BufferedReader(fr);
//            for ( int i = 0; i < lineCount; i++ ) {
//                line[i] = bf.readLine();
//                i++;
//            }
//            return line;
//        }
//        return null;
//    }
//    public static char[] charsInFile(String path) throws IOException {
//        String line[] = linesInFile(path);
//        int charCount = 0;
//        for ( String str : line ) {
//            charCount += line.length;
//        }
//        char charArray[]
//    }
    public char[] charsInFile(String path) throws IOException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        StringBuffer sb = new StringBuffer(scanner.nextLine());
        while (scanner.hasNextLine()) {
            sb.append("\n" + scanner.nextLine());
        }
        String string = sb.toString();
        return string.toCharArray();
    }

    
}
