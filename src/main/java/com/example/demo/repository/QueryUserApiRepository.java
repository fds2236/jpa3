package com.example.demo.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserApi;
import com.querydsl.jpa.impl.JPAQueryFactory;


@Repository
public class QueryUserApiRepository {
	UserApi userApi;
//	QUserApi quserApi;
	private final JPAQueryFactory factory;
	
	@Autowired
    private final EntityManager entityManager; 
	
    public QueryUserApiRepository(JPAQueryFactory factory, EntityManager entityManager) {
        this.factory = factory;
        this.entityManager = entityManager; 
//        this.userApi = QUserApi.userApi;

    }
	
	
	
	
	
	
	
	
}
