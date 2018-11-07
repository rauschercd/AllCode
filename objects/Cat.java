public class Cat {
    int happiness;
    int scolding;

    public Cat(int happiness) {
        this.happiness = happiness;
        this.scolding = 0;
    }

    private void changeHappiness(int amount) {
        happiness = happiness + amount;
    } 

    public void pet() {
        changeHappiness(-50);
        System.out.println("YOU PETTED ME? MY HAPPINESS IS NOW " + happiness);
    } 

    public void scold() {
        scolding++;    
        System.out.println("You scolded me. My scolds: " + scolding);    
    }

    public void feed() {
        if(scolding >= 3) {
            changeHappiness(50);
            scolding = 0;
            System.out.println("You fed me! My Happiness is now " + happiness);
        }
        else {
            scolding = 0;
            System.out.println("YOU DARED FEED ME BEFORE YOU SCOLDED ME THRICE?");
        }
    }
}