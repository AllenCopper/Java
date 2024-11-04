class Player {
    String name, ranking;
    int age;

    Player(String name, String ranking, int age) {
        this.name = name;
        this.ranking = ranking;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Ranking: " + ranking);
        System.out.println("Age: " + age);
    }
}

class Cricket_Player extends Player {
    String game, role;

    Cricket_Player(String name, String ranking, int age, String game, String role) {
        super(name, ranking, age);
        this.game = game;
        this.role = role;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Game: " + game);
        System.out.println("Role: " + role);
    }
}

class Football_Player extends Player {
    String league, place;

    Football_Player(String name, String ranking, int age, String league, String place) {
        super(name, ranking, age);
        this.league = league;
        this.place = place;
    }

    @Override
    void display() {
        super.display();
        System.out.println("League: " + league);
        System.out.println("Place: " + place);
    }
}

class Hockey_Player extends Player {
    String league, position;

    Hockey_Player(String name, String ranking, int age, String league, String position) {
        super(name, ranking, age);
        this.league = league;
        this.position = position;
    }

    @Override
    void display() {
        super.display();
        System.out.println("League: " + league);
        System.out.println("Position: " + position);
    }
}

public class TestPlayer {
    public static void main(String[] args) {
        Player player1 = new Cricket_Player("Virat Kohli", "1", 35, "Cricket", "Batsman");
        Player player2 = new Football_Player("Lionel Messi", "1", 36, "La Liga", "Forward");
        Player player3 = new Hockey_Player("Sushant Singh Rajput", "2", 34, "Indian Hockey League", "Midfielder");

        player1.display();
        System.out.println();
        player2.display();
        System.out.println();
        player3.display();
    }
}
