import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Posts, Users } from './classi';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

ApiPosts: string = "http://localhost:3000/posts"
ApiUsers: string = "http://localhost:3000/users"



  constructor(private http:HttpClient) { }


  getAllPosts():Observable<Posts[]> {
    return this.http.get<Posts[]>(this.ApiPosts)
  }

  getAllUsers():Observable<Users[]> {
    return this.http.get<Users[]>(this.ApiUsers)
  }

  addPosts(post: Posts) {
    return this.http.post<Posts>(this.ApiPosts,post)
  }
  addUsers(user: Users) {
    return this.http.post<Users>(this.ApiUsers,user)
  }

  editPosts(post: Posts) {
    return this.http.patch<Posts>(this.ApiPosts+'/'+ post.id, post)
  }

  editUsers(user: Users) {
    return this.http.patch<Users>(this.ApiUsers+'/'+ user.id, user)
  }

  deletePosts(post: Posts) { 
    return this.http.delete<Posts>(this.ApiPosts+'/'+post.id)
  }

  deleteUsers(user: Users) {
    return this.http.delete<Users>(this.ApiUsers+'/'+user.id)
  }

  




}

