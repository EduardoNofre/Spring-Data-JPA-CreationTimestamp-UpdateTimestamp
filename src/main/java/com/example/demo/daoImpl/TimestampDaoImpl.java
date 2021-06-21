package com.example.demo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.TimestampDao;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.repository.TimestampRepository;

@Repository
public class TimestampDaoImpl implements TimestampDao {
	
	@Autowired
	private TimestampRepository timestampRepository;

	@Override
	public List<TimestampEntity> buscaTodos() {
		return timestampRepository.findAll();
	}

	@Override
	public TimestampEntity inserir(TimestampEntity timestampEntity) {
		return timestampRepository.save(timestampEntity);
	}

	@Override
	public TimestampEntity atualizar(TimestampEntity timestampEntity) {
		return timestampRepository.save(timestampEntity);
	}
}
