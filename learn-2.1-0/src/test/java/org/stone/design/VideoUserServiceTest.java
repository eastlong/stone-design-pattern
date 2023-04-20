package org.stone.design;

import org.junit.Test;

public class VideoUserServiceTest {

    @Test
    public void testServeGrade() {
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serveGrade("VIP用户");
        videoUserService.serveGrade("普通用户");
        videoUserService.serveGrade("访客用户");
    }
}
