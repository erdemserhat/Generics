import java.util.HashMap;

public class Analyzer<E extends Candidate> {
    public void lister(E[] e) {

        for (E array : e) {
            System.out.println(array.getName() + " :" + array.calculateScore());
        }

    }


}
