package Learning.FirstLearnign.WorldOfWarcraftExample;

public class Hero {
    private final int champ;
    private final int race;
    private final int faction;

    public final static int ALLIANCE = 1;
    public final static int HORDE = 2;

    public final static int HUMAN = 1;
    public final static int DWARF = 2;
    public final static int NIGHTELF = 3;
    public final static int GNOME = 4;
    public final static int DRAENEI = 5;
    public final static int ORC = 6;
    public final static int UNDEAD = 7;
    public final static int TAUREN = 8;
    public final static int TROLL = 9;
    public final static int BLOODELF = 10;

    public final static int DEATHKNIGHT = 1;
    public final static int DRUID = 2;
    public final static int HUNTER = 3;
    public final static int MAGE = 4;
    public final static int PALADIN = 5;
    public final static int PRIEST = 6;
    public final static int ROGUE = 7;
    public final static int SHAMAN = 8;
    public final static int WARLOCK = 9;
    public final static int WARRIOR = 10;

    public Hero(int faction, int race, int champ) {
        assert isValidFaction(faction);
        assert isValidRace(race);
        assert isValidChamp(champ);
        this.faction = faction;
        this.race = race;
        this.champ = champ;
    }

    public int getFaction() {
        return faction;
    }
    public int getRace() {
        return race;
    }
    public int getChamp() {
        return champ;
    }

    public static boolean isValidFaction(int faction) {
        return ALLIANCE <= faction && faction <= HORDE;
    }
    public static boolean isValidRace(int race) {
        return HUMAN <= race && race <= BLOODELF;
    }
    public static boolean isValidChamp(int champ) {
        return DEATHKNIGHT <= champ && champ <= WARRIOR;
    }

    public static String factionToString(int faction) {
        switch (faction) {
            case ALLIANCE:
                return "ALLIANCE";
            case HORDE:
                return "HORDE";
            default:
                return null;
        }
    }
    public static String raceToString(int race) {
        switch (race) {
            case HUMAN:
                return "HUMAN";
            case DWARF:
                return "DWARF";
            case NIGHTELF:
                return "NIGHTELF";
            case GNOME:
                return "GNOME";
            case DRAENEI:
                return "DRAENEI";
            case ORC:
                return "ORC";
            case UNDEAD:
                return "UNDEAD";
            case TAUREN:
                return "TAUREN";
            case TROLL:
                return "TROLL";
            case BLOODELF:
                return "BLOODELF";
            default:
                return null;
        }
    }
    public static String champToString(int champ) {
        switch (champ) {
            case DEATHKNIGHT:
                return "DEATHKNIGHT";
            case DRUID:
                return "DRUID";
            case HUNTER:
                return "HUNTER";
            case MAGE:
                return "MAGE";
            case PALADIN:
                return "PALADIN";
            case PRIEST:
                return "PRIEST";
            case ROGUE:
                return "ROGUE";
            case SHAMAN:
                return "SHAMAN";
            case WARLOCK:
                return "WARLOCK";
            case WARRIOR:
                return "WARRIOR";
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        assert factionToString(ALLIANCE) == "ALLIANCE";
        assert factionToString(HORDE) == "HORDE";

        assert raceToString(HUMAN) == "HUMAN";
        assert raceToString(DWARF) == "DWARF";
        assert raceToString(NIGHTELF) == "NIGHTELF";
        assert raceToString(GNOME) == "GNOME";
        assert raceToString(DRAENEI) == "DRAENEI";
        assert raceToString(ORC) == "ORC";
        assert raceToString(UNDEAD) == "UNDEAD";
        assert raceToString(TAUREN) == "TAUREN";
        assert raceToString(TROLL) == "TROLL";
        assert raceToString(BLOODELF) == "BLOODELF";

        assert champToString(DEATHKNIGHT) == "DEATHKNIGHT";
        assert champToString(DRUID) == "DRUID";
        assert champToString(HUNTER) == "HUNTER";
        assert champToString(MAGE) == "MAGE";
        assert champToString(PALADIN) == "PALADIN";
        assert champToString(PRIEST) == "PRIEST";
        assert champToString(ROGUE) == "ROGUE";
        assert champToString(SHAMAN) == "SHAMAN";
        assert champToString(WARLOCK) == "WARLOCK";
        assert champToString(WARRIOR) == "WARRIOR";


    }




}
