package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherForecastServiceTestSuite {
    WeatherForecastService service = new WeatherForecastService();
    User user = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Monit monit = Mockito.mock(Monit.class);

    @Test
    public void SubscribedClientAddedToLocationReceiveNotification() {
        service.sendNotificationToUsersFromLocation(location2, monit);
        Mockito.verify(user3, Mockito.times(1)).receive(monit);
    }

    @Test
    public void ClientsSubscriptionCanBeRemovedFromLocation() {
        service.removeSubscriberFromLocation( location2, user3);
        service.sendNotificationToUsersFromLocation(location2, monit);
        Mockito.verify(user3, Mockito.times(0)).receive(monit);
    }

    @Test
    public void UsersFromDifferentLocationShouldNotReceiveNotification() {
        service.sendNotificationToUsersFromLocation(location2, monit);
        Mockito.verify(user, Mockito.times(0)).receive(monit);
    }

    @Test
    public void UsersFromAllLocationReceiveNotification() {
        service.sendNotificationToAll(monit);
        Mockito.verify(user, Mockito.times(1)).receive(monit);
        Mockito.verify(user2, Mockito.times(1)).receive(monit);
    }
    @Test
    public void LocationCanBeRemovedAndNotificationWontBeSent() {
        service.removeLocation(location2);
        service.sendNotificationToUsersFromLocation(location2, monit);
        Mockito.verify(user3, Mockito.times(0)).receive(monit);
        Mockito.verify(user2, Mockito.times(0)).receive(monit);
    }


    @BeforeEach
    public void addSubscribers() {
        service.addSubscriber(location, user);
        service.addSubscriber(location,user3);
        service.addSubscriber(location2, user2);
        service.addSubscriber(location2, user3);

    }
}