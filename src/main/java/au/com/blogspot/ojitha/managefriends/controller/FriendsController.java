package au.com.blogspot.ojitha.managefriends.controller;

import au.com.blogspot.ojitha.managefriends.domain.Friend;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ojitha on 10/04/2016.
 */
@RestController
public class FriendsController {

    @RequestMapping(value = "/friends",method = RequestMethod.GET)
    public List<Friend> allFriends(){
        List<Friend> friends = new ArrayList<>();
        Friend f1 = new Friend();
        f1.setName("Ojitha");
        f1.setAge(40);
        friends.add(f1);

        Friend f2 = new Friend();
        f2.setName("Mark");
        f2.setAge(30);
        friends.add(f2);

        Friend f3 = new Friend();
        f3.setName("Tom");
        f3.setAge(24);
        friends.add(f3);

        return friends;
    }
}
