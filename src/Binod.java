/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/08/20
 *  Time: 9:58 PM
 *  File Name : Binod.java
 * */

public class Binod {
//    To see the Binod's comment.
private static String seeTheComment(String comment) {
    becomeFamous();
    return comment;
}

    // method becomeFamous() to tell us how Binod became famous.
    private static void becomeFamous() {
        System.out.println("Binod was a YouTube comment that became a viral meme in India in August 2020." +
                " It originated from a YouTube channel called \"Slayy Point\" who discovered comments by a channel " +
                "named Binod Tharu, that had not uploaded any videos and was only adding his first names in comment section of YouTube videos.");
    }

    // To know more about Binod "HAHAHAHA...."
    public static String moreAboutBinod() {
        return seeTheComment("Binod");
    }

    public static void main(String[] args) {

        System.out.println("Binod");
        System.out.println("famous ho gya");

        String findBinod = moreAboutBinod();
        System.out.println(findBinod);
    }

}
