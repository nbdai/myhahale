package com.dzl.mapper;

import java.util.List;

import com.dzl.pojo.SearchRecords;
import com.dzl.utils.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}