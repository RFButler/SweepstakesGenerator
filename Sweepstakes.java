import java.util.*;

public class Sweepstakes {
    private static String[] userArr;
    private static String[] playerArr;
    private static int numUsers;
    private static int numGroups;

    public String[] users(){
        System.out.print("Enter Number of Users >");
        Scanner input = new Scanner(System.in);
        numUsers = Integer.parseInt(input.next());

        userArr = new String[numUsers];
        Scanner input2 = new Scanner(System.in);

        for(int i = 0; i<numUsers; i++){
            System.out.print("Enter User " + (i+1) + " >");
            userArr[i] = input2.next();
        }

        return userArr;
    }

    public String[] players(){
        Scanner input = new Scanner(System.in);

        int x = userArr.length;
        playerArr = new String[x*5];

        for (int j = 0; j < x*5; j++) {
            System.out.print("Enter Player " + (j + 1) + " >");
            playerArr[j] = input.next();
        }

        return playerArr;
    }

    public String[] groups(){
        List<String> strList = Arrays.asList(Arrays.copyOfRange(playerArr, 0, numUsers));
        Collections.shuffle(strList);
        String[] playerArr1 = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(playerArr1));

        List<String> strList2 = Arrays.asList(Arrays.copyOfRange(playerArr, numUsers, numUsers*2));
        Collections.shuffle(strList2);
        String[] playerArr2 = strList2.toArray(new String[strList2.size()]);
        System.out.println(Arrays.toString(playerArr2));

        List<String> strList3 = Arrays.asList(Arrays.copyOfRange(playerArr, numUsers*2, numUsers*3));
        Collections.shuffle(strList3);
        String[] playerArr3 = strList3.toArray(new String[strList3.size()]);
        System.out.println(Arrays.toString(playerArr3));

        List<String> strList4 = Arrays.asList(Arrays.copyOfRange(playerArr, numUsers*3, numUsers*4));
        Collections.shuffle(strList4);
        String[] playerArr4 = strList4.toArray(new String[strList4.size()]);
        System.out.println(Arrays.toString(playerArr4));

        List<String> strList5 = Arrays.asList(Arrays.copyOfRange(playerArr, numUsers*4, numUsers*5));
        Collections.shuffle(strList5);
        String[] playerArr5 = strList5.toArray(new String[strList5.size()]);
        System.out.println(Arrays.toString(playerArr5));

        return playerArr;
    }

    public static void main(String[] args) {
        Sweepstakes s = new Sweepstakes();
        s.users();
        s.players();
        System.out.println(Arrays.toString(userArr));
        System.out.println(Arrays.toString(s.groups()));

    }
}
