package sample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class cardsQueueProb {
	public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(deck);
        int len=deck.length;
        int[] res=new int[len];
        for(int i=0; i<len; i++) q.add(i);
        for(int i=0; i<len; i++){
            res[q.poll()]=deck[i];
            q.add(q.poll());
        }
        return res;
    }
}
