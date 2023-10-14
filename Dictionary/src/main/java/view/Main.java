package view;

import controller.Manager;
import java.util.HashMap;


public class Main {
    private static Manager manager = new Manager();
    

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //loop until user want to exit
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.addNewWord(hm);
                    break;
                case 2:
                    manager.deleteWord(hm);
                    break;
                case 3:
                    manager.translate(hm);
                    break;
                case 4:
                    return;
            }
        }
    }
}
