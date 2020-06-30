import packTwo.*;
package packOne;

public class ClassOne {

    public int member1;
    int member2;

    public ClassOne() {
        ClassTwo b = new ClassTwo();
        b.publicMethod();
        System.out.println(b.member1);
        System.out.println(b.member2);
    }
}