import { Injectable } from '@angular/core';
import { User } from './Models/classe';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { 

  }

  Users : User[] = [];

  getUsers() {
    return this.Users

}

addnewUser(user:User):void{
  user = Object.assign({}, user)

  this.Users.push(user);
}


}
