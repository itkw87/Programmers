class Solution {
    public String solution(String new_id) {
        // 1단계 : 대문자 -> 소문자로 변경
        new_id = new_id.toLowerCase();
        
        // 2단계 : 소문자, 숫자, '-', _', '.' 제외한 모든 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
        
        // 3단계 : 2번 이상 연속된 .은 하나의 .으로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4단계 : 처음과 끝에 위치한 .이 있다면 제거
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        
        // 5단계 : 빈 문자열이라면, new_id에 "a"를 대입
        new_id = new_id.replaceAll("^$", "a");
        
        // 6단계 : 16자 이상이라면, 15번째이후의 모든 문자 제거 + 끝에 위치한 문자가 .이라면 제거
        new_id = new_id.replaceAll("^(.{15}).*$", "$1").replaceAll("[.]$", "");
        
        // 7단계 : 문자열이 2자 이하라면, 문자열의 마지막 문자를 문자열의 길이가 3이 될 때까지 반복해서 끝에 붙이기
        if (new_id.length() <= 2) {
            String lastStr = new_id.charAt(new_id.length() - 1) + "";
            while (new_id.length() < 3) {
                new_id += lastStr;
            }
        }
        return new_id;
    }
}