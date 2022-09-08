import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/Models/classe';
import { PostsService } from 'src/app/posts.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  

  constructor(private postsSvc: PostsService) { }

  Posts:Post[] = []

  ngOnInit(): void {
    this.Posts = this.postsSvc.getPosts()
  }

  deletePost(post: Post){
    if(post.id){
      this.postsSvc.deletePost(post.id)
      this.Posts = this.postsSvc.getPosts()
    }
  }

}
