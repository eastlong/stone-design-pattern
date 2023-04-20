package org.stone.design.service;

import org.stone.design.service.impl.GuestVideoUserService;

public class ApiTest {
    public static void main(String[] args) {
        IVideoUserService guest = new GuestVideoUserService();
        guest.advertisement();
        guest.definition();
        // 其他两个，自己补充
    }

}
