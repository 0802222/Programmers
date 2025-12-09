import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reportedCount = new HashMap<>();
        
        // user 초기화
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportedCount.put(id, 0);
        }
        
        // 신고기록 처리
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            if (reportMap.get(reporter).add(reported)) {
                reportedCount.put(reported, reportedCount.get(reported) + 1);
            }
        }
        
        // k 번 이상 신고당한 유저 찾기
        HashSet<String> suspended = new HashSet<>();
        for (String user : reportedCount.keySet()) {
            if (reportedCount.get(user) >= k) {
                suspended.add(user);
            }
        }
        
        
        // 메일 개수 세기
        int[] answer = new int[id_list.length];
        
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            int mail = 0;
            
            for (String reported : reportMap.get(user)) {
                if (suspended.contains(reported)) {
                    mail++;
                }
            }
            answer[i] = mail;
        }
        return answer;
    }
}