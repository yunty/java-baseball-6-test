package View;

import java.util.Scanner;

public class InputView {
    Scanner input;

    public InputView(Scanner input) {
        this.input = input;
    }

    public int getUserNumber(){
        return input.nextInt();
    }
    public int getExitorAgain(){
        return input.nextInt();
    }
    
}
