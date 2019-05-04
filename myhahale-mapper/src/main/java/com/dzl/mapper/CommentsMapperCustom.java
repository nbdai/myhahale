package com.dzl.mapper;

import java.util.List;

import com.dzl.pojo.Comments;
import com.dzl.pojo.vo.CommentsVO;
import com.dzl.utils.MyMapper;
import org.springframework.stereotype.Repository;

@Repository

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}