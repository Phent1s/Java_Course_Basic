package Homework.Lesson19;

public class Test1 {

    public static String[] abc(String[]... array) {
    int length = 0;
    for (String[] array2 : array){
        length += array2.length;
    }
    String[] target = new String[length];
    int count = 0;
    for (String [] array2 : array){
        for (String s : array2){
            target[count] = s;
            count ++;
        }
    }
    return target;
    }


    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"hello", "ok", "bye"});
        for (String s : args){
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])){
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
