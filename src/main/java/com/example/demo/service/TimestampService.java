package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TimestampDao;
import com.example.demo.entity.TimestampEntity;

@Service
public class TimestampService {

	@Autowired
	private TimestampDao timestampDao;

	public List<TimestampEntity> buscaTodasTimestamp() {
		return timestampDao.buscaTodos();
	}

	public TimestampEntity cadastroTimestamp(TimestampEntity timestampEntity) {
		return timestampDao.inserir(timestampEntity);
	}

	public TimestampEntity atualizaTimestamp(TimestampEntity timestampEntity) {
		return timestampDao.atualizar(timestampEntity);
	}
}
