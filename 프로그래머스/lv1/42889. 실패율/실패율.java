import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int N, int[] stages) {
        int mok = stages.length;
        List<Integer> stageList = Arrays.stream(stages).boxed().collect(Collectors.toList());
        Map<Integer, Double> failRateMap = new HashMap();

        for (int i = 0; i < N; i++) {
            double failRate = Collections.frequency(stageList, i + 1) / (double)mok;
            failRateMap.put(i + 1, failRate);
            mok -= Collections.frequency(stageList, i + 1);
        }
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(failRateMap.entrySet());
        entryList.sort(comp);

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Double> entry : entryList){
            list.add(entry.getKey());
        }
        int []result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
    
    static Comparator<Map.Entry<Integer, Double>> comp = new Comparator<Map.Entry<Integer, Double>>() {
        @Override
        public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
            if(o1.getValue() > o2.getValue())
                return -1;
            else if (o1.getValue() < o2.getValue()) {
                return  1;
            }
            else
                return 0;
        }
    };
}