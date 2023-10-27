package org.facedamon.door.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author facedamon
 * @date 2023/10/26 17:05
 */
@Data
@NoArgsConstructor
public class UserInfo {

    private String userName;
    private Integer age;
    private String address;

    private String code;
    private String info;

    public UserInfo(String userName, Integer age, String address) {
        this.code = "0000";
        this.info = "success";
        this.userName = userName;
        this.age = age;
        this.address = address;
    }

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
