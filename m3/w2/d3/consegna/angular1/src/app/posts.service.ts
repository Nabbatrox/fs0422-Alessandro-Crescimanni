import { Injectable } from '@angular/core';
import { Posts } from './posts';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  constructor() { }
  
  posts:Posts [] = []
addNew(post: Posts):void{
  let postCopy = Object.assign({}, post);
  this.posts.push(postCopy);
}
}

