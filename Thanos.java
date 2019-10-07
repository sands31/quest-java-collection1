import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list
        Hero bw = new Hero("Black Widow", 34);
        Hero ca = new Hero("Captain America", 100);
        Hero v = new Hero("Vision", 3);
        Hero im = new Hero("Iron Man", 48);
        Hero sw = new Hero("Scarlet Witch", 29);
        Hero t = new Hero("Thor", 1500);
        Hero sm = new Hero("Spider-Man", 18);
        Hero h = new Hero("Hulk", 49);
        Hero ds = new Hero("Doctor Strange", 42);

        heroes.add(bw);
        heroes.add(ca);
        heroes.add(v);
        heroes.add(im);
        heroes.add(sw);
        heroes.add(t);
        heroes.add(sm);
        heroes.add(h);
        heroes.add(ds);

        // TODO 3 : It's Thor birthday, now he's 1501
        t.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> aliveHeroes = heroes.subList(0, heroes.size()/2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero survivor : aliveHeroes) {
            System.out.println(survivor.getName());
        }
    }
}