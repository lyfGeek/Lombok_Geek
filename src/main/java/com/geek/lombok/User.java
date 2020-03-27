package com.geek.lombok;

import lombok.*;
import lombok.extern.java.Log;

import java.io.*;
import java.util.HashMap;

@Data
//@Getter
//@Setter
//@ToString(exclude = {"phone"})
//@EqualsAndHashCode(exclude = "password")
//@RequiredArgsConstructor
@Builder
@Log
public class User {

    //    @Getter(AccessLevel.PROTECTED)
//    @Setter
    final int id2;
    @NonNull
    private Integer id;
    private String username;
    private String password;
    //    @Getter(AccessLevel.MODULE.NONE)
//    private String phone;
//    private String email;

    public static void main(String[] args) throws FileNotFoundException {

        User user = User.builder().id(1).username("geek").password("123").build();

        System.out.println("user = " + user);
/*
        User user = new User(1, 1);
        user.setId(1);
        user.setUsername("Geek");
//        user.setEmail("liyifan@lyfGeek.club");
        System.out.println(user);

        System.out.println("~ ~ ~ ~ ~ ~ ~");

*/
        user.test("test_hello");

        // 编译时再指定类型。
        val map = new HashMap<>();


        @Cleanup InputStream inputStream = new FileInputStream("~/test.txt");
        @Cleanup OutputStream outputStream = new FileOutputStream("path");
        // 就不需要 .close(); 了。
    }

    public void test(@NonNull String s) {
        System.out.println(s);
        log.info("log_info");
    }

}
