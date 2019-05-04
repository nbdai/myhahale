package com.dzl.service;

import java.util.List;

import com.dzl.pojo.Bgm;

public interface BgmService {
	
	/**
	 * @Description: 查询背景音乐列表
	 */
	public List<Bgm> queryBgmList();
	
	/**
	 * @Description: 根据id查询bgm信息
	 */
	public Bgm queryBgmById(String bgmId);
}
