public class Pig {
    double weight;
    double lastWeightEaten;
    Boolean eligible;
    Boolean eaten;

    public Pig(int weight) {
        this.weight = weight;
        this.eligible = false;
        this.eaten = false;
        this.lastWeightEaten = 0;
    }

    public void feed(double amount) {
        weight = weight + (amount * 0.75);
        System.out.println("You fed your pig " + amount + " lbs of food! It's weight is now " + weight);
        eaten = true;
        lastWeightEaten = amount * 0.75;
    }

    public void exercise(double hours) {
        if(eaten) {
            weight = weight - lastWeightEaten - (hours / 3); 
            System.out.println("You exercised after a meal for " + hours + " hours!, your pig now weighs " + weight);
            eaten = false;
        }
        else{
            weight = weight - (hours / 3);
            System.out.println("You exercised your pig for " + hours + " hours! Your pig now weighs " + weight);
        }
    }

    public void blueRibbonEligible() {
        if(weight > 1000) {
            eligible = true;
            System.out.println("Your pig is blue ribbon eligible!");
        }
        else{
            System.out.println("Sorry, your pig is not blue ribbon eligible. It only weighs " + weight);
        }
    }
}