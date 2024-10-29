import java.util.ArrayList;
import java.util.Set;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {
    Set<Transaction> pendingTransactions; 

    double p_graph;
    double p_malicious;
    double p_txDistribution; 
    int numRounds; 

    boolean[] followees; 
    
    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
        // IMPLEMENT THIS
        this.p_graph = p_graph;
        this.p_malicious = p_malicious;
        this.p_txDistribution = p_txDistribution;
        this.numRounds = numRounds;
    }

    public void setFollowees(boolean[] followees) {
        // IMPLEMENT THIS
        this.followees = followees;
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        // IMPLEMENT THIS
        this.pendingTransactions = pendingTransactions;
    }

    public Set<Transaction> getProposals() {
        // IMPLEMENT THIS
        return pendingTransactions;
    }

    public void receiveCandidates(ArrayList<Integer[]> candidates) {
        // IMPLEMENT THIS
        int length = candidates.size();
        int i = 0;

        while (i < length) {
            pendingTransactions.add(new Transaction(candidates.get(i)[0]));
            i++;
        }
    }
}
