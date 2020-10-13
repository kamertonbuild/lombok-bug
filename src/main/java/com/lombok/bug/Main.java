package com.lombok.bug;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    final Dto build = Dto.builder()
        .field1("1")
        .field2(List.of("2"))
        .build();

    final Dto field2 = build.withField2(List.of("3"));
    System.out.println(field2);
  }
}


