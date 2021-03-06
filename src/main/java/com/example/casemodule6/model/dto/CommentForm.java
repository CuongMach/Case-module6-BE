package com.example.casemodule6.model.dto;

import com.example.casemodule6.model.entity.House;
import com.example.casemodule6.model.entity.Profile;
import com.example.casemodule6.model.entity.Reply;
import com.example.casemodule6.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentForm {
    private User user;

    private String text;

    private House house;

    private Profile profile;

}
