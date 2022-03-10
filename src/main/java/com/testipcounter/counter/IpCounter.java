package com.testipcounter.counter;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IpCounter implements FileReader{

    public void countIpAddress() {
        BufferedReader br = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("type file address");
        String fileAddress = scanner.nextLine();
        try {
            File file = new File(fileAddress);
            br = new BufferedReader(new java.io.FileReader(file));
            fileReader(br);
        } catch (IOException e) {
             e.printStackTrace();
        } finally {
            closeReader(br);
        }
    }

    @Override
    public void fileReader(BufferedReader bufferedReader) throws IOException {
        Set<String> ipAddressSet = new HashSet<>();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
            ipAddressSet.add(str);
        }

        System.out.print("ip address count  " + ipAddressSet.size() + " ");
    }

    @Override
    public void closeReader(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException ignore) {
            }
        }
    }
}
