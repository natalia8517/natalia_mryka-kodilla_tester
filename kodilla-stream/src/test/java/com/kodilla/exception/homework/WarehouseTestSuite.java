package com.kodilla.exception.homework;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite extends TestCase {

    @Test
    public void testIsOrderOnList() throws OrderDoesntExistException {
        // given
        Warehouse warehous = new Warehouse();
        warehous.addOrder(new Order("1"));
        warehous.addOrder(new Order("2"));
        warehous.addOrder(new Order("3"));
        //when
        Order order = warehous.getOrder("1");
        //then
        assertEquals("1", order.getNumber());
    }

    @Test(expected = OrderDoesntExistException.class) // ten test nie przechodzi, nie wiem jak go poprawić.
    public void testIsOrderOnList_withException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        // when
        Order order = warehouse.getOrder("5");
        // then
        assertNotEquals("1", order.getNumber());
    }
}