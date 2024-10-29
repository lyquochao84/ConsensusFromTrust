import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class MaliciousNode implements Node {
   
   public MaliciousNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
   }
   
   public void receiveCandidates(ArrayList<Integer[]> candidates) {
      return;
   }
   
   public Set<Transaction> getProposals() {
      return new HashSet<Transaction>();
   }

   public void setFollowees(boolean[] followees) {
      return;
   }

   public void setPendingTransaction(Set<Transaction> pendingTransactions) {
      return;
   }
}
