public class MouseTester {
    public static void main(String[] args) {
        Dog rover = new Dog("Rover", "Doggo", 50);
        Mouse mouse1 = new Mouse(50);

        mouse1.meetDog(rover);
        mouse1.runSpeed();

        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();

        mouse1.meetDog(rover);
        mouse1.runSpeed();

        mouse1.meetCat();
        mouse1.runSpeed();
    }
}