public class DogTester {
    public static void main(String[] args) {
        Dog rover = new Dog("Doggo1", "Type Doggo", 1); 
        Dog rover2 = new Dog("Doggo2", "Type Doggo", 2); 
        System.out.println(rover.getName());
        System.out.println(rover2.getName());

        rover.setName("ASDFGHOAISJDLKJHVGC BNJAOISLIKCHJG AHSKOMICPKOIUYTSAYFDOJIPASKHG VASBUDYFTCASVBUJIOPWIEUHGCA DASIDUGAHSDK");
        rover2.setName("KAJHSDKJAHSKJDHKJAhgfASJDGJASDGAGDKHJAGHGKCJLASKLDKJALSUHDLJSAKDLABHSDHKAJSHDKVJAHSDBHAMSJDKBJMHASHDBABSCJKA");
        rover.setSayHi("HELLO, MY NAME IS " + rover.name);

        System.out.println(rover.sayHi);
        System.out.println(rover.name);
        System.out.println(rover2.bark);

        rover.feed();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.pet();
        rover.feed();

        System.out.println("My happiness is " + rover.happiness);
        

    }

}