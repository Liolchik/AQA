public class PhraseOMatic {
    public static void main(String[] args){

    String[] wordListOne = {"круглосуточный", "трехзвенный", "30000-футовый", "взфимный", "обходной", "на основе веб технологий", "семизначный"};
    String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "центральный", "распределенный", "фирменный"};
    String[] wordListThree = {"процесс", "тип", "талант", "подход", "ускоренный", "общий", "совместный"};
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int randOne = (int) (Math.random() * oneLength);
    int randTwo = (int) (Math.random() * twoLength);
    int randThree = (int) (Math.random() * threeLength);
    String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree [randThree];
System.out.println("Все что нам нужно, это - " + phrase);
}
}
