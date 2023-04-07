public abstract class Candidate {
    private String name;
    private int mathScore;
    private int grammarScore;
    private int scienceScore;

    public Candidate(String name, int mathScore, int grammarScore, int scienceScore) {
        this.mathScore = mathScore;
        this.grammarScore = grammarScore;
        this.scienceScore = scienceScore;
        this.name = name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getGrammarScore() {
        return grammarScore;
    }

    public void setGrammarScore(int grammarScore) {
        this.grammarScore = grammarScore;
    }

    public int getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(int scienceScore) {
        this.scienceScore = scienceScore;
    }

    public void setName(String name){
        this.name=name;

    }

    public String getName(){
        return this.name;
    }

    /**
     * Score will be calculated according to verbal/numerical student type.
     */
    public abstract int calculateScore();

    @Override
    public String toString() {
        return this.name;
    }
}
