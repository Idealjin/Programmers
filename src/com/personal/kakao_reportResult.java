import java.util.*;


//    public static void main(String[] args) {
//        indexQuiz quiz = new indexQuiz();
//        int[] arr = {1,3,5,4,5,2,1};
//        int[] result = new int[10];
//        result = quiz.solution(arr);
//        for(int res : result){
//            System.out.println(res);
//        }
//    }
public class kakao_reportResult {
    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(solution2(id_list, report, k)));

    }

    public static int[] solution(String[] id_list, String[] report, int k){
        int[] answer= {};
        List<Integer> answer1 = new LinkedList<>();
        Map<String, Integer> id_report = new HashMap<>();
        Map<String, Integer> id_snipe = new HashMap<>();
        //신고당한 횟수 저장
        List<String> pause = new LinkedList<>();
        List<String> id22 = new LinkedList<>();

        for(String s : report){
            String[] report1 = s.split(" ");
            id_report.put(report1[1], id_report.getOrDefault(report1[1], 0)+1);
            if (id_report.get(report1[1]) >= k){
                pause.add(report1[1]);
            }
        }
            System.out.println(id_report);
        for(String s : report) {
            String[] report1 = s.split(" ");
            if (pause.contains(report1[1])){
                id22.add(report1[0]);
                 }
        }

        System.out.println(answer1);

        return answer;
    }

    public static int[] solution2(String[] id_list, String[] report, int k){
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
            System.out.println(map);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            System.out.println(send + " send");
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }

}
//import java.util.*;
//class Solution {
//    public int[] solution(String[] id_list, String[] report, int k) {
//        int[] answer = new int[id_list.length];
//
//        Map<String, HashSet<String>> map = new HashMap<>();
//        Map<String, Integer> mapIdx = new HashMap<>();
//
//        for(int i= 0; i < id_list.length; i++){
//            mapIdx.put(id_list[i], i);
//            map.put(id_list[i], new HashSet<>());
//        }
//
//        for(String re : report){
//            String[] temp = re.split(" ");
//            String to = temp[1]; //신고당한 사람
//            String from = temp[0];  //신고한 사람
//            map.get(to).add(from);
//        }
//
//        for(int i = 0; i < id_list.length; i++){
//            HashSet<String> send = map.get(id_list[i]);
//            if(send.size() >= k){
//                answer[mapIdx.get(send)]++;
//            }
//        }
//        return answer;
//    }
//}