package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecastService {
    Map<User, Location> usersConnectedToLocation = new HashMap<>();


    public void addSubscriber(User user, Location location) {
        this.usersConnectedToLocation.put(user,location);

    }

    public void sendNotificationToUsersFromLocation(Location location, Monit monit) {

        for (Map.Entry<User, Location> userEntry: usersConnectedToLocation.entrySet()){
            if (location == userEntry.getValue()){
                userEntry.getKey().receive(monit);
            }
        }
    }
    public void sendNotificationToAll( Monit monit) {

        for (Map.Entry<User, Location> userEntry: usersConnectedToLocation.entrySet()){
            userEntry.getKey().receive(monit);
        }
    }


    public void removeSubscriberFromLocation(User user, Location location) {
        this.usersConnectedToLocation.remove(user, location);
    }

    }

