package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoomTest {
    @Test
    public void checkIn_roomInitialStatus_theRoomIsOccupiedAndDirty() {
        //Arrange
        Room room = new Room(10, 139);

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void checkOut_roomStatus_theRoomIsNotOccupiedAndDirty(){
        //Arrange
        Room room2 = new Room(5,139);

        //Act
        room2.checkIn();
        room2.checkout();
        //Assert
        assertFalse(room2.isOccupied());
    }
    @Test
    public void cleanRoom_roomCleaned_theRoomIsClean(){
        //Arrange
        Room room3 = new Room(10,139);
        //Act
        room3.cleanRoom();
        //Assert
        assertTrue(room3.isCleanRoom());
        assertFalse(room3.isOccupied());
        assertFalse(room3.isDirty());
    }

}