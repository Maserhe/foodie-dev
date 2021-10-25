package mapper;


import org.apache.ibatis.annotations.Param;
import top.maserhe.pojo.ItemsComments;
import top.maserhe.pojo.vo.MyCommentVO;

import java.util.List;
import java.util.Map;

public interface ItemsCommentsMapperCustom extends tk.mybatis.mapper.common.Mapper<ItemsComments> {

    public void saveComments(Map<String, Object> map);

    public List<MyCommentVO> queryMyComments(@Param("paramsMap") Map<String, Object> map);

}