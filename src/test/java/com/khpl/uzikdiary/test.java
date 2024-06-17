package com.khpl.uzikdiary;

import org.h2.server.web.WebServer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    @DisplayName("test")
    void test() {
        // given
        String rawPassword = "uzik-diary1234!"; // 설정하고자 하는 원본 비밀번호
        String encodedPassword = WebServer.encodeAdminPassword(rawPassword);
        System.out.println("Encoded Password: " + encodedPassword);

        // when

        // then
    }

}
