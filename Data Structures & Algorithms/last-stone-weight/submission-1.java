class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            maxHeap.offer(s);
        }

        while (maxHeap.size() > 1) {
            maxHeap.offer(maxHeap.poll()-maxHeap.poll());
        }

        return Math.abs(maxHeap.peek());

    }
}
