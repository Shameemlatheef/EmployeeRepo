package com.masai.Exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyError> getEmployeeException(EmployeeException ae,WebRequest req){
		MyError mr=new MyError(LocalTime.now(), ae.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyError>(mr,HttpStatus.BAD_REQUEST);
	}
}
