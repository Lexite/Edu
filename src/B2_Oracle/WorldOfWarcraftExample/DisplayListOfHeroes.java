package Learning.FirstLearnign.WorldOfWarcraftExample;

public class DisplayListOfHeroes {
    public static void main(String[] args) {
        ListOfHeroes listOfHeroes = new ListOfHeroes();
        for (int faction = Hero.ALLIANCE; faction <= Hero.HORDE; faction ++) {
            for (int race = Hero.HUMAN; race <= Hero.BLOODELF; race ++) {
                for (int champ = Hero.DEATHKNIGHT; champ <= Hero.WARRIOR; champ ++) {
                    Hero hero = listOfHeroes.getHero(faction, race, champ);
                    System.out.format("%s %s %s%n ",
                            hero.factionToString(hero.getFaction()),
                            hero.raceToString(hero.getRace()),
                            hero.champToString(hero.getChamp()));
                }
            }
        }
    }
}

