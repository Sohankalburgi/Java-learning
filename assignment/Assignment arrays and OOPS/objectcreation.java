import java.util.Scanner;


 class Game{
    int noOfPlayers;
    String Name;

    String nameofMap;
    String nameOfPlayer;

    void numberofplayers (int n){
        System.out.println("the Number of player in the game :"+ n);
    }
    static void numberofgroups(int g){
        System.out.println("the number of groups are :" +(int)g/4);
    }

    static void playername(String p)
    {
        System.out.println("player :" +p);
    }

    public static void main(String[] args) {
        Game z = new Game();
        z.playername("hello");
        z.noOfPlayers = 8;
        z.numberofgroups(z.noOfPlayers);


    }
}
