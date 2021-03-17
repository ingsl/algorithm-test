package stringNarray.uniqueEmailAddress;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    public static void main(String[] args) {

        UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();

        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@coding.com",
                "testemail+tom@cod.ing.com"
        };

        System.out.println( uniqueEmailAddress.solve(emails) );
    }

    public int solve(String[] emails) {

        String frontWord ="";
        String backWord ="";

        Set<String> set = new HashSet<>();

        for(String email : emails) {
            String localName = makeLocalName(email);
            String domainName = makeDomainName(email);

            set.add(localName+"@"+domainName);
        }

        return set.size();
    }

    public String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();

        for(int i =0; i < email.length(); i++) {

            if(email.charAt(i) == '.') {
                continue;
            }
            if(email.charAt(i) == '+' || email.charAt(i) == '@') {
                break;
            }
            String str = String.valueOf(email.charAt(i)) ;
            sb.append(str);
        }

        return sb.toString();
    }

    public String makeDomainName(String email) {
        return email.substring(email.indexOf('@')+1);
    }
}


