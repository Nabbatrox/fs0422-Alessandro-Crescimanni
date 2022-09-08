import { Injectable } from '@angular/core';
import { Post } from './Models/classe';

@Injectable({
  providedIn: 'root'
})


export class PostsService {


  constructor() { }

Posts : Post [] = [];

lastId: number = 0;

getPosts() {

  return this.Posts

}



addPost(post:Post):void{
    post = Object.assign({}, post)

   
    this.lastId++;
    post.id = this.lastId

    this.Posts.push(post);
  }

  deletePost(id:number):void{
    this.Posts = this.Posts.filter((p:Post) => p.id != id)
  }


  editPost(post:Post):void{
    let index = this.Posts.findIndex((p:Post) => p.id == post.id)
    this.Posts.splice(index, 1, post)
  }





}






