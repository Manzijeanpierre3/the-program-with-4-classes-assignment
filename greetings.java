// Interface definition
interface Greetable {
    void greet();
}

// Class English
class English implements Greetable {
    @Override
    public void greet() {
        System.out.println("Hello in English");
    }
}

// Class Spanish
class Spanish implements Greetable {
    @Override
    public void greet() {
        System.out.println("Hola in Spanish");
    }
}

// Class French
class French implements Greetable {
    @Override
    public void greet() {
        System.out.println("Bonjour in French");
    }
}

// Class German
class German implements Greetable {
    @Override
    public void greet() {
        System.out.println("Guten Tag in German");
    }
}

// Main class
public class greetings {
    public static void main(String[] args) {
        // Creating objects
        English english = new English();
        Spanish spanish = new Spanish();
        French french = new French();
        German german = new German();

        // Calling methods
        english.greet();
        spanish.greet();
        french.greet();
        german.greet();
    }
}

