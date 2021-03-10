package stringNarray.licenseKeyFormatting;

public class LicenseKeyFormatting {

    public static void main(String[] args) {

        String s = "8f3szsd";
        int k =4;
        System.out.println(licenseKeyFormatting(s,k));
    }

    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        sb.append(S.replace("-","").toUpperCase());

        int leng = sb.length();

        if(leng < K)  {
            return sb.toString();
        } else {
            for (int i=K; i < leng; i=i+K) {
                sb.insert(leng-i, '-');
            }
        }

        return sb.toString();
    }
}
