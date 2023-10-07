package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderService {
    public static int[] readArray() {
        int[] arrayInt;
        System.out.println("Enter a space-separated list of integer: ");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String data = reader.readLine();
            String[] elements = data.split("\\s+");
            arrayInt = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                arrayInt[i] = Integer.parseInt(elements[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't read data", e);
        }
        return arrayInt;
    }
}
