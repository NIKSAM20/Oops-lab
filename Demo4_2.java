/* 2)	Write a program in Java to create a Player class. 
        Inherit the classes  Cricket _Player, Football _Player and Hockey_ Player from Player class.  */

class Player{
    String name;
    void printPlayer(){
        System.out.println(this.name+" is a sports player");
    }
}

class Cricket_Player extends Player{
    void printCricket(){
        System.out.println(this.name+" is Cricket player");
        System.out.println();
    }
    
}

class Football_Player extends Player{
    void printFootball(){
        System.out.println(this.name+" is a Football player");
        System.out.println();
    }
    
}

class Hockey_Player extends Player{
    void printHockey(){
        System.out.println(this.name+" is a Hockey player");
        System.out.println();
    }
    
}

class Demo4_2 {
    public static void main(String args[]){

        Cricket_Player Virat= new Cricket_Player();
        Virat.name="Virat Kohli";
        Virat.printPlayer();
        Virat.printCricket();

        Football_Player Messi= new Football_Player();
        Messi.name="Lineol Messi";
        Messi.printPlayer();
        Messi.printFootball();

        Hockey_Player Dhyanchand =new Hockey_Player();
        Dhyanchand.name="Major Dhyanchand";
        Dhyanchand.printPlayer();
        Dhyanchand.printHockey();
    }
}