package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherForecastServiceTestSuite {
    WeatherForecastService service = new WeatherForecastService();
    User user = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Monit monit = Mockito.mock(Monit.class);


    @Test
    public void SubscribedClientAddedToLocationReceiveNotification() {
        service.sendNotificationToUsersFromLocation(location, monit);
        Mockito.verify(user, Mockito.times(1)).receive(monit);
    }

    @Test
    public void ClientsSubscriptionCanBeRemovedFromLocation() {
        service.removeSubscriberFromLocation(user, location);
        service.sendNotificationToUsersFromLocation(location, monit);
        Mockito.verify(user, Mockito.times(0)).receive(monit);
    }
//Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.

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

    //Możliwość skasowania danej lokalizacji.

    @BeforeEach
    public void addSubscribers() {
        service.addSubscriber(user, location);
        service.addSubscriber(user2, location2);
    }
}