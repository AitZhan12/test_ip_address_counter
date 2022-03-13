package counter;

import org.junit.Test;

public class MainTests {

    @Test
    public void contextLoads() throws Throwable {

        String fileAddress = "C:\\Users\\aitzhan\\Desktop\\IpAddress.txt";
        IpCounter ipCounter = new IpCounter();
        ipCounter.test(fileAddress);
    }
}
