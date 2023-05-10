package com.javamaster.controller.dao;

import com.javamaster.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private String gameId;
    private Player player;

}
