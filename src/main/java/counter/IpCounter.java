package counter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.BitSet;
import java.util.Scanner;

public class IpCounter implements FileReader {

    public void countIpAddress() throws Throwable {
        BufferedReader br = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("type file address");
        String fileAddress = scanner.nextLine();
        try {
            File file = new File(fileAddress);
            br = new BufferedReader(new java.io.FileReader(file));
            fileReader(br);
        } catch (IOException e) {
           throw  new Throwable("Exception while reading a file " + fileAddress);
        } finally {
            closeReader(br);
        }
    }

    public void test(String fileAddress) throws Throwable {
        BufferedReader br = null;
        try {
            File file = new File(fileAddress);
            br = new BufferedReader(new java.io.FileReader(file));
            fileReader(br);
        } catch (IOException e) {
            throw  new Throwable("Exception while reading a file " + fileAddress);
        } finally {
            closeReader(br);
        }
    }

    @Override
    public void fileReader(BufferedReader bufferedReader) throws IOException {
        BitSet bitSet = new BitSet();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            String stringIp = str.replaceAll("[,.]", "");
            long longIp = Long.parseLong(stringIp);
            bitSet.set((int) longIp);
        }
        System.out.print("ip address count " + bitSet.cardinality() + " ");
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
