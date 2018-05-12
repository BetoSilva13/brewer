package com.algaworks.brewer.controller.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.algaworks.brewer.service.exception.NomeEstiloJaCadastrado;

@ControllerAdvice
public class ControllerAdviceExceptionHandler {
	
	@ExceptionHandler(NomeEstiloJaCadastrado.class)
	public ResponseEntity<String> handleNomeEstiloCadastradoException(NomeEstiloJaCadastrado e) {
		return ResponseEntity.badRequest().body(e.getMessage());
		
	}

}
