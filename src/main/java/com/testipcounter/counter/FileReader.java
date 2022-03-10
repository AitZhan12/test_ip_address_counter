package com.testipcounter.counter;

import java.io.BufferedReader;
import java.io.IOException;

public interface FileReader {

    void fileReader(BufferedReader bufferedReader) throws IOException;
    void closeReader(BufferedReader bufferedReader);
}
