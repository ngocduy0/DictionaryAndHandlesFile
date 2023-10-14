package view;

import controller.Manager;


public class Main {
    private static Manager manager = new Manager();

    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.findPersonInfo();
                    break;
                case 2:
                    manager.coppyNewFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
