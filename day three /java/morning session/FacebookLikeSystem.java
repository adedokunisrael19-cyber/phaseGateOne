import java.utils.Arrays;
import java.util.Scanner;
public class FacebookLikeSystem{
    public static String printLikes(String[] names){
                
    int users = names[].length
    int manyUsers = users -2;
    if(users == 0){
        return "no user ike this ";
    }
    if(users == 1){
        return names[0] +" like this";
    }else if(users == 2){
        return names[0]+ names[1] +" like this";

    }else if(users == 3){
        return names[0]+ names[1] +names[2] +" like this";
    }else if(users == 4){
        return names[0]+ names[1] + manyUsers + "others like this";

}
