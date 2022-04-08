package functionalinterface;

@FunctionalInterface
 interface CallingBell{
     void ring(String tone);
 }

public class TestFunctionalInterface {
    public static void main(String[] args) {
        CallingBell bell = tone -> System.out.println(tone);
        bell.ring("Tring Tring");
    }
}
