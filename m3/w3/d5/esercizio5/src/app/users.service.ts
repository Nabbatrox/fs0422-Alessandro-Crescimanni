import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Users } from './users';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  apiUsers:string = 'http://localhost:3000/users'

  constructor(private http:HttpClient) { }

  getAllUsers():Observable<Users[]> {
    return this.http.get<Users[]>(this.apiUsers)
  }

  getUserById(id:Number):Observable<Users>{
    return this.http.get<Users>(this.apiUsers + "/" + id)
  }

  addUsers(user: Users):Observable<Users> {
    return this.http.post<Users>(this.apiUsers,user)
  }

  editUsers(user: Users):Observable<Users> {
    return this.http.patch<Users>(this.apiUsers+'/'+ user.id, user)
  }

  deleteUsers(user: Users):Observable<Users> {
    return this.http.delete<Users>(this.apiUsers+'/'+user.id)
  }

}
