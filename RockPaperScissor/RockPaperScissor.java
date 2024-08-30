package RockPaperScissor;

import java.awt.print.Paper;
import java.util.Random;
import java.util.Scanner;

public record RockPaperScissor() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            String[] rps = {"Rock", "Paper", "Scissor"};
            String ComputerMove;
            ComputerMove = rps[new Random().nextInt(rps.length)];


            String PlayerMove;

            while (true) {

                System.out.print("Enter your Move:(Rock , Paper, Scissor): ");
                PlayerMove = sc.nextLine();

                if (PlayerMove.equalsIgnoreCase("Rock") || PlayerMove.equalsIgnoreCase("Paper") || PlayerMove.equalsIgnoreCase("Scissor")) {
                    break;
                }
                System.out.println(PlayerMove + "is not a valid move!");
            }


            System.out.println("Computer Played:" + ComputerMove);


            if (PlayerMove.equals(ComputerMove)) {
                System.out.println("The Game is tied!");
            } else if (PlayerMove.equalsIgnoreCase("Rock")) {
                if (ComputerMove.equalsIgnoreCase("Paper")) {
                    System.out.println("You Lost");
                } else if (ComputerMove.equalsIgnoreCase("Scissor")) {
                    System.out.println("You Win!");

                }

            } else if (PlayerMove.equalsIgnoreCase("Paper")) {
                if (ComputerMove.equalsIgnoreCase("Scissor"))
                    System.out.println("You Lost");
                else if (ComputerMove.equalsIgnoreCase("Rock")) {
                    System.out.println("You Won!");
                }

            } else if (PlayerMove.equalsIgnoreCase("Scissor")) {
                if (ComputerMove.equalsIgnoreCase("Rock"))
                    System.out.println("You Lost");
                else if (ComputerMove.equalsIgnoreCase("Paper")) {
                    System.out.println("You Won!");
                }

            }

            System.out.print("You want to play again: Y/N? ");
            String PlayerWish = sc.nextLine();
            System.out.print("Thanks for playing!!");

            System.out.println("hhhhhhhhhh");
            /////////gitttttttttttttttt

            if(!PlayerWish.equalsIgnoreCase("Y")){
                break;
            }
        }

        //Thanks For Playing

    }

}




