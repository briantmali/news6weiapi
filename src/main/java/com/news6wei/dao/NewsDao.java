package com.news6wei.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.news6wei.entity.News;

public interface NewsDao extends CrudRepository<News, Long> {
	List<News> findNews(Long from, Long to);
}
