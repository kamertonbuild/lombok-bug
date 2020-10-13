package com.lombok.bug;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class Dto {

  String field1;

  @With
  @Builder.Default
  List<String> field2 = List.of();
}
