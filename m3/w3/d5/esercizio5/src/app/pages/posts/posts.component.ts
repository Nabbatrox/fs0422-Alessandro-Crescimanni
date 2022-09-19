import { Component, OnInit } from '@angular/core';
import { Posts } from 'src/app/posts';
import { PostsService } from 'src/app/posts.service';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.scss']
})
export class PostsComponent implements OnInit {

  posts: Posts[] = [];

  post: Posts = new Posts('','','');

  constructor( private postSvc:PostsService, private route: ActivatedRoute) { }

  ngOnInit(): void {

    this.postSvc.getAllPosts()
    .subscribe(post => {
      this.posts = post})


  }



  createPost(){
    this.postSvc.addPost(this.post).subscribe(res => {
      this.posts.push(res)
      this.post = new Posts('','','')
    })
  }



    delPost(post:Posts){
      this.postSvc.deletePost(post).subscribe(res => {
        let index = this.posts.findIndex(p => p.id === post.id)
        this.posts.splice(index,1)
      })
  
}
}
