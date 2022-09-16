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

  addUsers(user: Users) {
    return this.http.post<Users>(this.apiUsers,user)
  }

  editUsers(user: Users) {
    return this.http.patch<Users>(this.apiUsers+'/'+ user.id, user)
  }

  deleteUsers(user: Users) {
    return this.http.delete<Users>(this.apiUsers+'/'+user.id)
  }

}
