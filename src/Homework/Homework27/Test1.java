package Homework.Homework27;

public class Test1 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("Myaso");
        try {
            tiger.drink("Voda");
            try {
                tiger.drink("pivo");
            }  catch (NeVodaExeption e){
                e.getStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class NeMyasoExeption extends RuntimeException {
    NeMyasoExeption(String message) {super(message);}
}

class NeVodaExeption extends Exception {
    NeVodaExeption(String message) {super(message);}
}

class Tiger {
    void eat(String foodType) {
        if (!foodType.equals("Myaso")) {
            throw new NeMyasoExeption("Tigr ne est " + foodType);
        } else {
            System.out.println("Tigr est myaso");
        }
    }
    void drink (String type) throws NeVodaExeption {
        if (!type.equals("Voda")) {
            throw new NeVodaExeption("Tigr ne pyet "+type);
        } else {
            System.out.println("Tigr pyet vodu");
        }
    }
}