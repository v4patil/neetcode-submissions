class Solution {
     public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int n : nums) {
        freq.put(n, freq.getOrDefault(n, 0) + 1);
    }


    PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>(Map.Entry.comparingByValue());


    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        minHeap.offer(entry);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    int[] result = new int[k];
    int i = 0;
    while (!minHeap.isEmpty()) {
        result[i++] = minHeap.poll().getKey();
    }

    return result;
}

}
