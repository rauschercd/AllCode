public class Parrot {

    String lastHeard;
    int timesTalked;
    int sameWord;
    String previousWord;

    public Parrot() {
        lastHeard = "";
        timesTalked = 1;
        sameWord = 1;
    }

    public void talk(String lastHeard) {
        if(lastHeard == previousWord) {
            sameWord++;
            previousWord = lastHeard;
        }
        else{
            sameWord = 1;
            previousWord = lastHeard;
        }

        if(sameWord >= 3) {
            sameWord = 1;
            System.out.println("SQUAWK SQUAWK!" + lastHeard);
        }
        
        if(timesTalked >= 3) {
            System.out.println("SQUAWK! " + lastHeard);
            timesTalked = 1;
        }
        else {
            System.out.println(lastHeard);
            timesTalked++;
        }
    }

}