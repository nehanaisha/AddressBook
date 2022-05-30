package addressbook;

import java.util.ArrayList;
import java.util.Objects;

public class UserMange {
	static ArrayList<User> s = new ArrayList<>();

	public Boolean addUser(User user) {
		return s.add(user);
	}

	public ArrayList showInfo() {
		return s;
	}

	public boolean updateName(int no,String name){
        User user = null;
        for(User u:s) {
            if(no == u.getNo()) {
            	user=u;
            	user.setfirstName(name);
                break;
            }
        }
        if(user == null) {
            System.out.println ("the user does not exist");
            return false;
        }
        System.out.println ("modification succeeded!");
        return true;
    }
	
	

	public boolean delUser(int no) {
		User user = null;
		for (User u : s) {
			if (no == u.getNo()) {
				user = u;
				break;
			}
		}
		if (user == null) {
			System.out.println("the user does not exist");
			return false;
		}
		return s.remove(user);
	}
}