package org.facedamon.door.web;

import lombok.extern.slf4j.Slf4j;
import org.facedamon.door.annotation.DoDoor;
import org.facedamon.door.config.StarterService;
import org.facedamon.door.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author facedamon
 * @date 2023/10/26 17:07
 */
@RestController
@Slf4j
public class DemoController {

    @Autowired
    private StarterService starterService;

    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @GetMapping("/api/queryUserInfo")
    public UserInfo queryUserInfo(@RequestParam String userId) {
        log.info(Arrays.toString(starterService.split(",")));
        return new UserInfo("facedamon:" + userId, 19, "上海市");
    }
}
