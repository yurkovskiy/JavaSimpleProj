package yurkovskiy.com;

public class StringGames {

    private String text;

    public StringGames(String text) {
        this.text = text;
    }

    public String removeVowels() {
        //return this.text;
        return this.text.replaceAll("(?i)[aouie]", "");
    }
}
