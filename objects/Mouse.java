public class Mouse {

    int safety;
    int speed;

    public Mouse(int safety) {
        this.safety = safety;
    }

    public void meetDog(Dog dog) {
        if(dog.happiness > 50) {
            safety = safety + 20;
            System.out.println("You met a happy dog! Safety: " + safety);
        }
        else {
            System.out.println("You did not meet a happy dog! Safety: " + safety);
        }
    }

    public void meetCat() {
        safety = safety - 20;
        System.out.println("You met a cat! Safety: " + safety);
    }

    public void runSpeed() {
        if(safety <= 0) {
            speed = 100;
        }
        else if(safety >= 100) {
            speed = 1;
        }
        else{
            speed = 100 - safety; 
        }
        System.out.println("Your speed is: " + speed);
    }

}