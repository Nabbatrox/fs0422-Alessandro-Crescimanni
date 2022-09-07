import { Component, OnInit } from '@angular/core';
import { Posts } from 'src/app/posts';
import { PostsService } from 'src/app/posts.service';

@Component({
  selector: 'app-posts-read',
  templateUrl: './posts-read.component.html',
  styleUrls: ['./posts-read.component.css']
})
export class PostsReadComponent implements OnInit {

  posts:Posts [] = [] 


  constructor(private postSvc: PostsService) { }

  ngOnInit(): void {
    
    this.posts = this.postSvc.posts
    
  }
  

}
