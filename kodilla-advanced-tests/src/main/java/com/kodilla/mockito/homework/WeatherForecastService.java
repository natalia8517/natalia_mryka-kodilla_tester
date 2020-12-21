package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherForecastService {

    private Map<Location, Set<User>> subscriptions = new HashMap<>();



    public void addSubscriber(Location location, User user) {
        Set<User> locationSubscribers = subscriptions.get(location);
        if (locationSubscribers == null) {
            locationSubscribers = new HashSet<>();
        }
        locationSubscribers.add(user);
        subscriptions.put(location, locationSubscribers);
    }

    public void removeLocation(Location location) {
        if (subscriptions.size() > 0) {
            if (subscriptions.containsKey(location)) {

                subscriptions.remove(location);
            }
        }
    }

    public void sendNotificationToUsersFromLocation(Location location, Monit monit) {

        for (Map.Entry<Location, Set<User>> userEntry : subscriptions.entrySet()) {
            if (userEntry.getKey().equals(location)) {
                for (User user : userEntry.getValue()) {
                    user.receive(monit);
                }
            }
        }
    }

    public void sendNotificationToAll(Monit monit) {
        for (Map.Entry<Location, Set<User>> entry : subscriptions.entrySet()) {
            for (User user : entry.getValue()) {
                user.receive(monit);
            }
        }
    }

    public void removeSubscriberFromLocation(Location location, User user) {
        if (subscriptions.size() > 0) {

            for (Map.Entry<Location, Set<User>> entry : subscriptions.entrySet()) {
                if (entry.getKey().equals(location)) {
                    if ((entry.getValue().contains(user))) {
                        Set<User> newSet = entry.getValue();
                        newSet.remove(user);
                        //subscriptions
                        subscriptions.remove(entry);
                        subscriptions.put(location, newSet);
                    }
                }
            }
        }
    }
}
