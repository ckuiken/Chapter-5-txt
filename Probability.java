

public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    private double prob;
    private int sampleSpace;
    private double favorable;
    
    public Probability(int fav, int sample) {
        this.favorable = fav;
        this.sampleSpace = sample;
        prob= ((double)favorable);
    }
    public void getProbability() {
        this.prob = this.sample(this.sample + this.favorable);
    }
    public double ProbabilityAND(Probability p2){
        return this.prob * p2.prob;
    }
    
   
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 OR p2) = p1 + p2 - (p1 AND p2)  where p1 AND p2 is the "overlap"
     */
    public double ProbabilityOR(Probability p2, double overlap){
        return 0;
    }
    
    
    public int compareTo(Probability other) {
        if(this.prob> other.prob){
            return 1;
        }
        else if(this.prob < other.prob) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
