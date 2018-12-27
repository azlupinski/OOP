package part2.polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lot of people";
    }

}

class IndependanceDay extends Movie{
    public IndependanceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}


class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Empira forces try to take ove universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }

}


public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " is " + movie.getName() + "\n" +
                                " Plot: " + movie.plot() + "\n" );

        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependanceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
}