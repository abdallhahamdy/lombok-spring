package com.spring.lombok.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private  Long id;

    private  String name;

    private  String address;

    private  String age;


}
