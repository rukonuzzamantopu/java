package slidSolution;

class Bird {
    // Method to be overridden
    void Chirp() {
        System.out.println("Bird is chirping.");
    }
}

// Subclass for flying birds
class Flying_Bird extends Bird {
    // Overriding the Chirp() method
    @Override
    void Chirp() {
        System.out.println("Flying bird is chirping melodiously while soaring through the sky!");
    }
}

// Subclass for non-flying birds
class Non_Flying_Bird extends Bird {
    // This class uses the inherited Chirp() method
    // Optionally, you could also override it here if needed
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of Flying_Bird and Non_Flying_Bird
        Bird myFlyingBird = new Flying_Bird();
        Bird myNonFlyingBird = new Non_Flying_Bird();
        
        // Calling the Chirp() method on both instances
        myFlyingBird.Chirp();       // Calls the overridden method in Flying_Bird
        myNonFlyingBird.Chirp();    // Calls the method in the base Bird class
    }
}
