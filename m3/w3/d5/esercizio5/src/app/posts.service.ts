import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Posts } from './posts';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  apiPosts: string = "http://localhost:3000/posts"

  constructor(private http:HttpClient) { }

  getAllPosts():Observable<Posts[]> {
    return this.http.get<Posts[]>(this.apiPosts)
  }

  addPosts(post: Posts) {
    return this.http.post<Posts>(this.apiPosts,post)
  }

  editPosts(post: Posts) {
    return this.http.patch<Posts>(this.apiPosts+'/'+ post.id, post)
  }
  

  deletePosts(post: Posts) { 
    return this.http.delete<Posts>(this.apiPosts+'/'+post.id)
  }

}
