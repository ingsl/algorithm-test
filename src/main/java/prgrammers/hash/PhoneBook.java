package prgrammers.hash;

import java.util.Arrays;

public class PhoneBook {
    public static void main(String[] args) {

        String[] phone_book = {"113", "44", "4544"};

        PhoneBook pb = new PhoneBook();

        pb.solution(phone_book);


    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }

}
