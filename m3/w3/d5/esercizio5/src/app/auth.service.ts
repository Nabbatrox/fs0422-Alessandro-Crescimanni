import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Users } from './users';
import { Login } from './login';

type AuthResponse = {
  accessToken: string,
  user:Users
}

@Injectable({
  providedIn: 'root'
})

export class AuthService {



  constructor(private http:HttpClient) { }


  apiUrl:string = 'http://localhost:3000'

  register(registered:Users){
    return this.http.post<AuthResponse>(this.apiUrl+'/users', registered )
  }

  saveAuthToStorage(data:AuthResponse){
    localStorage.setItem('user-access',JSON.stringify(data))
  }

  login(loginData:Login){
    return this.http.post<AuthResponse>(this.apiUrl+'/login', loginData)
  }

  isUserLogged(): boolean{

    return localStorage.getItem('user-access') != null

  }
}
