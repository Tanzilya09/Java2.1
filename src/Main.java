public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog("Bobic",Colors.WHITE,3);
        FightingDog bulldog=new FightingDog("Boss",Colors.BROWN,6);
        FightingDog doberman=new FightingDog("Santiago",Colors.BLACK,5);
        dog.life("Bobic",Colors.WHITE,3);
        bulldog.life("Boss",Colors.BROWN,6);
        doberman.life("Santiago",Colors.BLACK,5);
        System.out.println( dog.getName()+" "+dog.getColors()+" "+dog.getWins());
        System.out.println(doberman.getName()+" "+doberman.getColors()+" "+doberman.getWins());
        System.out.println(bulldog.getName()+" "+bulldog.getColors()+" "+bulldog.getWins());
    }
}