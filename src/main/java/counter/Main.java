package counter;

public class Main {

    public static void main(String[] args) throws Throwable {
        counter();
    }


    private static void counter() throws Throwable {
        IpCounter ipCounter = new IpCounter();
        ipCounter.countIpAddress();
    }
}
