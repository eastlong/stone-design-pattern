package org.stone.design.service.impl;

import org.stone.design.service.IVideoUserService;

public class VipVideoUserService implements IVideoUserService {

    @Override
    public void definition() {
        System.out.println("VIP用户，视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }
}
