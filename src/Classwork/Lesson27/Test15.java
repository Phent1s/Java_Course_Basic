package Classwork.Lesson27;

public class Test15 {
 void maraphone(int airTemperature, int runSpeed) throws PodvernutbNoguExeption {
     if (runSpeed > 12) {
         throw new PodvernutbNoguExeption("Too fast: " + runSpeed);
     }
     if (airTemperature > 32) {
         throw new SveloMishcu();
     }
     System.out.println("You win!");
 }

    public static void main(String[] args) {
        Test15 test = new Test15();
        try {
            test.maraphone(33,11);
        } catch (PodvernutbNoguExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("You have a prize!");
        }

    }
}

class PodvernutbNoguExeption extends Exception {
    PodvernutbNoguExeption(String message){
        super(message);
    }
    PodvernutbNoguExeption(){}
}

class SveloMishcu extends RuntimeException {

}
