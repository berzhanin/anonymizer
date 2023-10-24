package com.example.anonymize.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Berzhanin_DV
 */

@Service
public class FileService {
    public List<String> findAll(File directory) {
        if (!directory.exists() || !directory.canRead()) {
            System.err.println("Directory is not found or can't be read: " + directory);
        }

        List<String> list = new ArrayList<>();
        for (final File fileEntry : directory.listFiles()) {
            if (fileEntry.isFile()) {
                System.out.println("File: " + fileEntry.getName());
            } else {
                System.out.println("Directory: " + fileEntry.getName());
            }
            list.add(fileEntry.getName());
        }
        return list;
    }

    public void anonymizeDirectory(File directory) throws IOException {
        updateFiles(directory);
    }

    private static void updateFiles(File directory) throws IOException {
        if (!directory.exists() || !directory.canRead()) {
            System.out.println("Directory is not found or can't be read: " + directory);
        }
        for (final File fileEntry : directory.listFiles()) {
            if (fileEntry.isFile()) {
                System.out.println("File: " + fileEntry.getName());
                anonymizeFile(fileEntry);
            } else {
                System.out.println("Directory: " + fileEntry.getName());
            }
        }
    }

    private static void anonymizeFile(File file) throws IOException {
        File inputFile = new File(file.getPath());
        File outputFile = new File(file.getPath() + ".anonymized");
        BufferedReader input = new BufferedReader(new FileReader(inputFile));
        BufferedWriter output = new BufferedWriter(new FileWriter(outputFile));
        String st;

        while ((st = input.readLine()) != null) {
            StringBuilder builder = new StringBuilder(st);
            if (st.startsWith("10")) {
                builder = builder.replace(67, 82, "********   ****");
                output.write(builder.toString());
                output.newLine();
                output.flush();
            } else if (st.startsWith("0500")) {
                builder = builder.replace(12, 20, "********");
                output.write(builder.toString());
                output.newLine();
                output.flush();
            } else if (st.startsWith("050Y")) {
                builder = builder.replace(81, 85, "****");
                output.write(builder.toString());
                output.newLine();
                output.flush();
            } else {
                output.write(builder.toString());
                output.newLine();
                output.flush();
            }
        }
        input.close();
        output.close();
    }
}