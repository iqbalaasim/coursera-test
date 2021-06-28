package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AuthenticationRequest;
import com.example.demo.model.AuthenticationResponse;
import com.example.demo.model.UserModel;
import com.example.demo.model.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.utils.JwtUtil;

@RestController
public class AuthController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
	@GetMapping("/dashboard")
	private String testingToken(){
		
		return "Welcome to the Dashboard"+ SecurityContextHolder.getContext().getAuthentication().getName();
	}
		
		
	
	@PostMapping("/subs")
	private ResponseEntity<?> subsrcibeClient(@RequestBody AuthenticationRequest authenticationRequest){
		
		String username=authenticationRequest.getUsername();
		String password=authenticationRequest.getPassword();
		UserModel userModel=new UserModel();
		userModel.setUsername(username);
		userModel.setPassword(password);
		
		try {
			userRepository.save(userModel);
		}catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error"+username));
			
			
		}
		
		return ResponseEntity.ok(new AuthenticationResponse("Succesfull login"+username));
				
	}
	
	@PostMapping("/auth")
	private ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authenticationRequest){
		
		String username=authenticationRequest.getUsername();
		String password=authenticationRequest.getPassword();
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
			
		}catch(Exception e){
			return ResponseEntity.ok(new AuthenticationResponse("Error"+username));
		}
		
		UserDetails loadedUser=userService.loadUserByUsername(username);
		String generatedToken=jwtUtil.generateToken(loadedUser);
		
		return ResponseEntity.ok(new AuthenticationResponse(generatedToken));
		
		
		
		
		
	}

}
