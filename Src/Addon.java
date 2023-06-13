import java.util.Random;

public class Addon {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100000) + 10;
        System.out.println(randomInt);
        int firstNum = randomInt % 10;
        int secondNum = randomInt / 10;
        int threNum = randomInt / 10;
        threNum = threNum%10;
        secondNum = secondNum%10;
        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(threNum);
        System.out.println(firstNum + secondNum + threNum);

    }
}

