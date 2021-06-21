package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TimestampEntity;
import com.example.demo.service.TimestampService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Validated
@RequestMapping("/api/Timestamp")
@Tag(name = "Controller", description = "Timestamp crud API")
public class ControllerTimestamp {


	
	@Autowired
	private TimestampService timestampService;
	
	@Operation(summary = "Busca todos os Timestamp", description = "Busca todos os Timestamp", tags = {"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Timestamp encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, nenhum Timestamp encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "Todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<TimestampEntity>> buscaTodos() {

		return new ResponseEntity<List<TimestampEntity>>(timestampService.buscaTodasTimestamp(), HttpStatus.OK);
	}
	
	@Operation(summary = "Cadastro de Timestamp", description = "Cadastro de Timestamp", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Timestamp cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Timestamp não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PostMapping(value = "Cadastro", produces = { "application/json", "application/xml" })
	public ResponseEntity<TimestampEntity> cadastroTimestamp(@RequestBody @Valid TimestampEntity timestampEntity) throws Exception {

		return new ResponseEntity<TimestampEntity>(timestampService.cadastroTimestamp(timestampEntity), HttpStatus.OK);
	}
	
	@Operation(summary = "atualiza de Timestamp", description = "Cadastro de Timestamp", tags = {"Atualiza" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Timestamp cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Timestamp não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PutMapping(value = "atualiza", produces = { "application/json", "application/xml" })
	public ResponseEntity<TimestampEntity> atualizarTimestamp(@RequestBody @Valid TimestampEntity timestampEntity) throws Exception {

		return new ResponseEntity<TimestampEntity>(timestampService.atualizaTimestamp(timestampEntity), HttpStatus.OK);
	}
}
