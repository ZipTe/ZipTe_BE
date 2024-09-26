package com.eedo.ZipTe.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private String email;
    private String pw;
    private String nickName;

    private boolean social;

    private String city;
    private String roadName;
    private String detail;
    private int zipcode;

}
