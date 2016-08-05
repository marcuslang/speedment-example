package org.rapidpm.speedment.test;

import com.company.public_.Public_Application;
import com.company.public_.postgres.public_.user.User;
import com.speedment.Speedment;
import com.speedment.manager.Manager;

public class SpeedmentTutorial {

  public static void main(String[] args) {
    Speedment speedment = new Public_Application()
        .withPassword("password")
        .build();
    Manager<User> users = speedment.managerOf(User.class);

    users.stream().forEach(user -> System.out.println(user.getName()));

  }


}
