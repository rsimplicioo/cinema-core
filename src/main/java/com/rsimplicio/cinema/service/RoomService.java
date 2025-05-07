package com.rsimplicio.cinema.service;

import com.rsimplicio.cinema.domain.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    Room create(Room room);
    List<Room> listAll();
    Optional<Room> findById(Long id);
    void delete(Long id);
}
