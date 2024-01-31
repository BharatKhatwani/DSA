package College;

// Define an interface for a Player
interface Player {
    void play();
}

// Create a class that implements the Player interface
class AudioPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Playing audio...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of AudioPlayer
        Player player = new AudioPlayer();

        // Call the play method
        player.play();
    }
}
