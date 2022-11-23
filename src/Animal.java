public class Animal {
    private int wins;
    private String name;
    private Calendar birthday;
    private Colors colors;

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public Colors getColors() {
        return colors;
    }

    public int getWins() {
        return wins;
    }

    public Animal(String name,  Colors colors, int wins) {
        this.name = name;
        this.colors = colors;
        this.wins = wins;
    }
}
