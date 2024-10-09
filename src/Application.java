public class Application {

    private InputDevice inputDevice;

    public Application(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }

    public void useGetType() {
        inputDevice.getType();
    }

    public void useNextIN() {
        inputDevice.nextIN();
        int number = inputDevice.nextIN();
    }

    public void run() {

        System.out.println("Application started");
        System.out.println("Today's lucky numbers are:");
        System.out.println(inputDevice.nextIN());
        System.out.println(inputDevice.nextIN());

        playGame();


    }


    public void playGame() {

        System.out.println("Game started");

        int player1Number, player2Number, player1 = 0, player2 = 0, H, S, round=1;

        while (player2 < 5 && player1 < 5) {

            player1Number = inputDevice.nextIN();

            player2Number = inputDevice.nextIN();

            System.out.println("Round " + round);
            System.out.println("Player1 Number: " + player1Number);
            System.out.println("Player2 Number: " + player2Number);
            System.out.println();

            round++;

            if (player1Number != player2Number) {

               if(player1Number > player2Number) {

                   H = player1Number;
                   S = player2Number;

                   if(S >= 10 && H % S == 0)
                       player2 = player2 + 1;
                   else
                       player1 = player1 + 1;

               }
               else {
                   H = player2Number;
                   S = player1Number;
                   if(S >= 10 && H % S == 0)
                       player1 = player1 + 1;
                   else
                       player2 = player2 + 1;

               }

            } else {

                player1 = player1 + 2;
                player2 = player2 + 2;

            }
        }

        if(player2 > player1)
            System.out.println("Player2 have WON the game");
        else if(player1 > player2)
            System.out.println("Player1 have WON the game");
        else
            System.out.println("Equal");
    }
}