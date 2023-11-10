// Interface definition
interface WorldCupWinner {
    void displayInfo();
}

// Class Brazil
class Brazil implements WorldCupWinner {
    @Override
    public void displayInfo() {
        System.out.println("Brazil won the World Cup in 1958, 1962, 1970, 1994, and 2002.");
    }
}

// Class Germany
class Germany implements WorldCupWinner {
    @Override
    public void displayInfo() {
        System.out.println("Germany won the World Cup in 1954, 1974, 1990, and 2014.");
    }
}

// Class Argentina
class Argentina implements WorldCupWinner {
    @Override
    public void displayInfo() {
        System.out.println("Argentina won the World Cup in 1978 and 1986.");
    }
}

// Class France
class France implements WorldCupWinner {
    @Override
    public void displayInfo() {
        System.out.println("France won the World Cup in 1998 and 2018.");
    }
}

// Main class
public class winner{
    public static void main(String[] args) {
        // Creating objects
        Brazil brazil = new Brazil();
        Germany germany = new Germany();
        Argentina argentina = new Argentina();
        France france = new France();

        // Calling methods
        brazil.displayInfo();
        germany.displayInfo();
        argentina.displayInfo();
        france.displayInfo();
    }
}

