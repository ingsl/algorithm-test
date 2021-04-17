package prgrammers.greedy;

public class Joystick {
    public static void main(String[] args) {
        String name ="JAZ";

        System.out.println(solution(name));
    }

    public static int solution(String name) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            sb.append("A");
        }


        int answer = 0;
        int alphabbetLanth = 26;

        if((name.charAt(0) - 'A') > 12) {
            answer += alphabbetLanth - (name.charAt(0) - 'A');
        } else {
            answer += (name.charAt(0) - 'A');
        }

        sb.setCharAt(0, name.charAt(0));

        int answerUp = answer;
        int answerDown =answer;

        answerUp = getAnswerUp(name, sb, alphabbetLanth, answerUp);
        answerDown = getAnswerDown(name, sb, alphabbetLanth, answerDown);

        answer = Math.min(answerUp, answerDown);

        return answer;
    }

    private static int getAnswerDown(String name, StringBuilder sb, int alphabbetLanth, int answerDown) {
        StringBuilder sbd = new StringBuilder();
        sbd.append(sb);

        for (int i = name.length()-1; i >= 1; i--) {
            if(!sbd.toString().equals(name) ) {
                answerDown++;
                if ((name.charAt(i) - 'A') > 12) {
                    answerDown += alphabbetLanth - (name.charAt(i) - 'A');
                } else {
                    answerDown += (name.charAt(i) - 'A');
                }
                sbd.setCharAt(i, name.charAt(i));
            }
        }
        return answerDown;
    }

    private static int getAnswerUp(String name, StringBuilder sb, int alphabbetLanth, int answerUp) {
        StringBuilder sbu = new StringBuilder();
        sbu.append(sb);
        for (int i = 1; i < name.length(); i++) {
            if(!sbu.toString().equals(name)) {
                answerUp++;
                if((name.charAt(i) - 'A') > 12) {
                    answerUp += alphabbetLanth - (name.charAt(i) - 'A');
                } else {
                    answerUp += (name.charAt(i) - 'A');
                }

                sbu.setCharAt(i, name.charAt(i));
            }
        }
        return answerUp;
    }
}
