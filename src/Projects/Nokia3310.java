package Projects;

import java.util.Scanner;

public class Nokia3310 {



    Scanner input = new Scanner(System.in);

    boolean exit;

        public void printWelcome() {

            System.out.println("""
                    +--------------------------+
                    |           NOKIA          |
                    |      Connecting People   |
                    +--------------------------+
                    """);
        }

        public void printMenuList() {
            System.out.println("""
                        (1) Phonebook
                        (2) Messages
                        (3) Chat
                        (4) Call register
                        (5) Tones
                        (6) Settings
                        (7) Call divert
                        (8) Clock
                                 
                        (0) Exit
                    """);
        }

        public void runMenu() {
            printWelcome();
            while (!exit) {
                printMenuList();
                int option = getUserInput();
                menuChoice(option);
            }
        }
        public int getUserInput() {
            int count = 1;
            int options = -1;
            while(options < 0 || options >8) {
                System.out.println("Enter your option: ");
                options = Integer.parseInt(input.nextLine());
                count++;

                if (count == 3) {
                    System.out.println("Last chance to enter a valid option");
                    options = Integer.parseInt(input.nextLine());
                    System.out.println("Goodbye and go buy better phone!!!");
                    break;
                }
            }
            return options;
            }

    public void menuChoice(int options) {
        switch (options) {
            case 0 -> {
                exit = true;
                System.out.println("GoodBye and go buy better phone!!");
            }
            case 1 -> phoneBookMenu();
            case 2 -> Messages();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> clock();
            default -> exit = true;
        }
    }

    private void nokiaOptions() {
        int count= 1;
       while (!exit) {
        int options = -1;
        System.out.print("Enter your option: ");
        options = Integer.parseInt(input.nextLine());

        if (options == 99) {
            runMenu();
        }
        if (options == 0) {
            System.out.println("Goodbye and go buy better phone!!");
            exit = true;
        }
    }
    }

    private void phoneBookMenu() {
        System.out.println("""
                    +--------------------------+
                    |        Phonebook         |
                    +--------------------------+
                        (1) Search
                        (2) Service No
                        (3) Add Name
                        (4) Delete
                        (5) Edit
                        (99) Main menu
                        (0) Exit
                    """);

        nokiaOptions();

    }

    private void Messages() {
        System.out.println("""
                    +--------------------------+
                    |        Messages          |
                    +--------------------------+
                        (1) Write message
                        (2) Inbox
                        (3) Picture message
                        (4) Message settings
                        (5) Smileys
                        (99) Main menu
                        (0) Exit
                    """);

        nokiaOptions();
    }

    private void chat() {
        System.out.println("""
                    +--------------------------+
                    |         Chat             |
                    +--------------------------+
                        (1) Start chat
                        (99) Main menu
                        (0) Exit
                    """);

        nokiaOptions();

    }

    private void callRegister() {
        System.out.println("""
                    +--------------------------+
                    |      Call register       |
                    +--------------------------+
                        (1) Missed calls
                        (2) Received calls
                        (3) Dialled numbers
                        (4) Erase recent calls
                        (5) Show call duration
                        (99) Main menu
                        (0) Exit
                    """);
        nokiaOptions();
    }

    private void tones() {
        System.out.println("""
                    +--------------------------+
                    |          Tones           |
                    +--------------------------+
                        (1) Ringing tone
                        (2) Ringing volume
                        (3) Incoming call alert
                        (4) Composer
                        (5) Message alert tone
                        (99) Main menu
                        (0) Exit
                    """);
        nokiaOptions();
    }

    private void settings() {
        System.out.println("""
                    +--------------------------+
                    |        Settings          |
                    +--------------------------+
                        (1) Call settings
                        (2) Phone settings
                        (3) Security settings
                        (4) Display settings
                        (5) Restore factory settings
                        (99) Main menu
                        (0) Exit
                    """);
        nokiaOptions();
    }

    private void callDivert() {
        System.out.println("""
                    +--------------------------+
                    |       Call divert        |
                    +--------------------------+
                        (1) Incoming calls
                        (2) Outgoing calls                   
                        (99) Main menu
                        (0) Exit
                    """);
        nokiaOptions();
    }

    private void clock() {
        System.out.println("""
                    +--------------------------+
                    |         Clock            |
                    +--------------------------+
                        (1) Clock settings
                        (2) Alarm
                        (3) Date settings
                        (4) Stop watch
                        (5) Countdown timer
                        (99) Main menu
                        (0) Exit
                    """);
        nokiaOptions();
    }

}
