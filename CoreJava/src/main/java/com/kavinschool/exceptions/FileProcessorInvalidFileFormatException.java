package com.kavinschool.exceptions;

import java.io.Serial;

/**
 * In a file processing system, an exception could occur when attempting to
 * process a file with an invalid format. Creating a custom exception for
 * invalid file formats in a software system.
 */
public class FileProcessorInvalidFileFormatException {

    private static class InvalidFileFormatException extends Exception {
        public InvalidFileFormatException(String message) {
            super(message);
        }
    }

    private static class FileProcessor {
        public void processFile(String file) throws InvalidFileFormatException {
            if (!file.endsWith(".txt")) {
                throw new InvalidFileFormatException("Invalid file format. Only .txt files are supported.");
            }
            System.out.println("Processing file: " + file);
        }
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        try {
            processor.processFile("document.txt");
        } catch (InvalidFileFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
