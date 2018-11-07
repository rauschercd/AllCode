public class PigTester {
    public static void main(String[] args) {

        Pig bacon = new Pig(100);

        bacon.blueRibbonEligible();
        bacon.feed(1250);
        bacon.blueRibbonEligible();
        bacon.exercise(3);
        bacon.exercise(30);
        bacon.feed(50);

    }
}