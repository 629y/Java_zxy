package cn.zxy.mapper;

import cn.zxy.model.HobbyInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HobbyInfoMapper {
    List<HobbyInfo> select(Integer hid);

}
