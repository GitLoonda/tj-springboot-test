package com.tj.edu.study;

import org.springframework.web.bind.annotation.*;

@RestController
public class MvcApiController1 {

    @RequestMapping(value = "/test1")
    public String test1() {
        return "test1...!!";
    }

    // POST 메소드는 데이터를 등록하는 메소드
    @PostMapping(value = "post-test1")
    public String postTest1() {
        return """
                {
                    "name" : "홍길동",
                    "birth" : "1990-05-20"
                }
                """;
    }

    @PutMapping(value = "put-test1")
    public String putTest1() {
        return "업데이트용 http 메소드";
    }

    @DeleteMapping(value = "delete-test1")
    public String deleteTest1() {
        return "삭제용 http 메소드";
    }
}
