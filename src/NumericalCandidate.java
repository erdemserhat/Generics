public class NumericalCandidate extends Candidate{
    public NumericalCandidate(String name,int mathScore, int grammarScore, int scienceScore) {
        super(name,mathScore, grammarScore, scienceScore);
    }

    /**
     * A numerical student should take point from numerical lessons.
     *
     */
    @Override
    public int calculateScore() {
        int totalPoint = getMathScore()*7 + getScienceScore()*5;
        return totalPoint;
    }
}
