public class Dog {

    //Properties
    String name;
    String breed;
    int tagNumber;
    String bark;
    String sayHi;
    public int happiness;
    Boolean petted; 

    //Constructor(s)
    public Dog(String name, String breed, int tagNumber) {
        this.name = name;
        this.breed = breed;
        this.tagNumber = tagNumber;
        this.bark = "BORK";
        this.sayHi = "Hello, my name is " + name;
        this.petted = false;
    }

    //Abilities

    //Getters

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }

    public String getBark() {
        return this.bark;
    }

    public String getSayHi() {
        return this.sayHi;
    }

    public int getHappiness() {
        return this.happiness;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setTagNumber(int tagNumber) {
        this.tagNumber = tagNumber;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
    
    public void setSayHi(String sayHi) {
        this.sayHi = sayHi;
    }

    private void changeHappiness(int amount) {
        happiness = happiness + amount;
    }

    public void pet() {
        changeHappiness(10);
        petted = true;
    }

    public void scold() {
        changeHappiness(-20);
    }

    public void feed() {
        if(happiness > 25) {
            if(petted) {
                changeHappiness(50);
                System.out.println("I JUST ATE, MY Happiness Level: " + happiness);
            }
        }
        else {
            System.out.println("I WILL NOT EAT, HUMAN.");
        }
    }
}