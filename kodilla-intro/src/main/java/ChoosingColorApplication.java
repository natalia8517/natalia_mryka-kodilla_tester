import java.awt.*;

public class ChoosingColorApplication {
    public static void main(String[] args) {
        Colors color = new Colors();
        String chosenColor = color.showColorName();
        System.out.println("You Chose " + chosenColor);

    }
}

