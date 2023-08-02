package cn.zxy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo {

    private Integer id;
    private String name;
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birthday;
    private String tel;
    private String address;
    private String self_introduce;

    List<HobbyInfo> hobbyInfos;

}
