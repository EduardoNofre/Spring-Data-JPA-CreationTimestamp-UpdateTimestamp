package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.TimestampEntity;

public interface TimestampDao {

	List<TimestampEntity> buscaTodos();

	TimestampEntity inserir(TimestampEntity timestampEntity);
	
	TimestampEntity atualizar(TimestampEntity timestampEntity);
}
