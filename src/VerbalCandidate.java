public class VerbalCandidate extends Candidate{
    public VerbalCandidate(String name,int mathScore, int grammarScore, int scienceScore) {
        super(name,mathScore, grammarScore, scienceScore);
    }

    /**
     * Verbal student should take point from verbal lessons.
     * @return
     */
    @Override
    public int calculateScore() {
        int totalPoint = getGrammarScore()*7 + getMathScore()*5;
        return totalPoint;
    }
}
