package Learning.FirstLearnign.WorldOfWarcraftExample;

public class ListOfHeroes {

    public static int numFactions = 2;
    public static int numRaces = 10;
    public static int numChamps = 10;

    public static int numHeroes = numFactions * numRaces * numChamps;

    private Hero[][][] heroes;

    public ListOfHeroes() {
        heroes = new Hero[numFactions][numRaces][numChamps];
        for (int faction = Hero.ALLIANCE; faction <= Hero.HORDE; faction ++) {
            for (int race = Hero.HUMAN; race <= Hero.BLOODELF; race ++) {
                for (int champ = Hero.DEATHKNIGHT; champ <= Hero.WARRIOR; champ ++) {
                    heroes[faction-1][race-1][champ-1] = new Hero(faction, race, champ);
                }
            }
        }
    }

    public Hero getHero(int faction, int race, int champ) {
        return heroes[faction-1][race-1][champ-1];
    }
}
