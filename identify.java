import java.util.ArrayList;

/**
 * Created by mansur on 6/14/2017.
 */
public class identify {
    ArrayList<String> pass;
    ArrayList <String> user;
    static String usr;
    
    public void init()
    {
        pass=new ArrayList<>();
        user=new ArrayList<>();
        pass.add("12345");
        pass.add("1");
        user.add("1");
        user.add("2");
        user.add("mansur");

    }
    public boolean check(String username,String password)
    {
        boolean p=false;
        boolean u=false;
        boolean result=false;
        for (String s: user)
        {
            if(s.equals(username))
            {
                u=true;
                break;
            }

        }
        for (String s: pass)
        {
            if(s.equals(password))
            {
                p=true;
                break;
            }
        }
        result=p&u;
        if(result){
            usr=username;
        }
        return result;

    }

}
