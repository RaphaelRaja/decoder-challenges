import java.util.Scanner;

public class stringMatching {

    public static String stringChecker(String chkChecker){
        boolean result = false;
        String[] input = new String[2];
        input = chkChecker.split(" ");
        String word, chkPhrase;

        word = input[0];
        chkPhrase = input[1];

        for(int i=0; i<word.length(); i++){
            //System.out.println("Outer i: "+i);
            if(word.charAt(i) == chkPhrase.charAt(0)){
                int j=1;
                i++;
                while ((j<chkPhrase.length()) && (i<word.length())){
                    if(word.charAt(i) == chkPhrase.charAt(j)){
                        result = true;
                        i++;
                        j++;
                    }
                    else {
                        break;
                    }

                }
            }

        }
        if(result == true){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entries = in.nextInt();
        String[] userEntries = new String[entries];
        in.nextLine();

        for (int i=0; i<entries; i++){
            userEntries[i] = in.nextLine();
        }

        for (int i=0; i<entries; i++){
            System.out.println(stringChecker(userEntries[i]));
        }
    }
}
