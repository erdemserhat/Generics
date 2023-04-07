public class Main {
    public static void main(String[] args) {

        NumericalCandidate jame = new NumericalCandidate("jame",25,25,25);
        NumericalCandidate mike = new NumericalCandidate("mike",30,20,19);
        NumericalCandidate jenny = new NumericalCandidate("Jenny",20,30,40);
        NumericalCandidate [] array = {jame,mike,jenny};
        Analyzer<Candidate> analyzer = new Analyzer<>();
        analyzer.lister(array);




    }

}