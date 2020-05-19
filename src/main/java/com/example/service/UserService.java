package com.example.service;

import org.springframework.stereotype.Service;

import com.example.domain.User;

//serviceアノテーション必須
@Service
public class UserService {
	
	//中身のつなっているドメインを引数に取る
	public User save(User user) {
		//本来はここでRepositoryを呼んでDBにインサートする
		//UserRepository repository = new UserRepository;
		//user = repository.insert(user);  idがnullのuserドメインにidを自動採番して代入
		//今回はただ返すだけ
		return user;
	}

}
